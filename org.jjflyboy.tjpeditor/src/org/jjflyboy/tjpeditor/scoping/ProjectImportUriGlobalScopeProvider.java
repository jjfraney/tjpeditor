package org.jjflyboy.tjpeditor.scoping;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;
import org.jjflyboy.tjpeditor.project.Global;
import org.jjflyboy.tjpeditor.project.IncludeProperties;
import org.jjflyboy.tjpeditor.project.Property;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ProjectImportUriGlobalScopeProvider extends
		ImportUriGlobalScopeProvider implements IProjectGlobalScopeProvider {
	
	@Inject
	private ImportUriResolver importResolver;
	
	@Inject
	private IResourceScopeCache cache;

	public IScope getScope(Resource resource, final EReference reference, EObject originalContext) {
		return getScope(resource, reference, null, originalContext);
	}
	
	public IScope getScope(Resource resource, final EReference reference, Predicate<IEObjectDescription> filter, EObject originalContext) {
		return getScope(resource, isIgnoreCase(reference), reference.getEReferenceType(), filter, originalContext);
	}


	protected IScope getScope(Resource resource, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter, EObject originalContext) {
		final LinkedHashSet<URI> uniqueImportURIs = getImportedUris(resource, originalContext);
		IResourceDescriptions descriptions = getResourceDescriptions(resource, uniqueImportURIs);
		List<URI> urisAsList = Lists.newArrayList(uniqueImportURIs);
		IScope scope = IScope.NULLSCOPE;
		for (URI uri : urisAsList) {
			scope = createLazyResourceScope(scope, uri, descriptions, type, filter, ignoreCase);
		}
		return scope;
	}


	protected LinkedHashSet<URI> getImportedUris(final Resource resource, final EObject originalContext) {
		List<Pair<URI, IncludeProperties>> uriList =
				cache.get(ProjectImportUriGlobalScopeProvider.class.getName(), resource, new Provider<List<Pair<URI, IncludeProperties>>>() {

			@Override
			public List<Pair<URI, IncludeProperties>> get() {
				Global global = (Global)resource.getContents().get(0);
				EList<Property> properties = global.getProperties();
				final List<Pair<URI, IncludeProperties>> map = new ArrayList<Pair<URI, IncludeProperties>>();
				for(Property property: properties) {
					if(property instanceof IncludeProperties) {
						String uriString = importResolver.apply(property);
						URI uri = URI.createURI(uriString);
						if(EcoreUtil2.isValidUri(resource, uri)) {
							map.add(Tuples.pair(uri, (IncludeProperties)property));
						}
					}
				}
				return map;
			}
		});
		LinkedHashSet<URI> result = new LinkedHashSet<URI>(10);
		
		Property topProperty = toTopProperty(originalContext);

		for(Pair<URI, IncludeProperties> pair: uriList) { 
			// if this include follows the original property
			if(follows(pair.getSecond(), topProperty)) {
				break;
			}
			result.add(pair.getFirst());
		}
		return result;
	}
	
	private Property toTopProperty(final EObject object) {
		EObject o = object;
		Property p = null;
		while(o != null) {
			if(o instanceof Property && o.eContainer() instanceof Global) {
				p = (Property)o;
				break;
			}
			o = o.eContainer();
		}
		return p;

	}
	/**
	 * true if include follows the property
	 * @param value
	 * @param property
	 * @return
	 */
	private boolean follows(IncludeProperties include, Property property) {
		boolean result = true;
		for(Property p: ((Global)(property.eContainer())).getProperties()) {
			if(p.equals(include)) {
				result = false;
				break;
			} else 	if(p.equals(property)) {
				break;
			}
		}
		return result;
	}

	protected IScope createLazyResourceScope(IScope parent, final URI uri, final IResourceDescriptions descriptions,
			EClass type, final Predicate<IEObjectDescription> filter, boolean ignoreCase) {
		IResourceDescription description = descriptions.getResourceDescription(uri);
		return ProjectSelectableBasedScope.createScope(parent, description, filter, type, ignoreCase);
	}


}
