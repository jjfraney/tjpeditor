package org.jjflyboy.tjpeditor.scoping;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
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
import org.eclipse.xtext.scoping.impl.LoadOnDemandResourceDescriptions;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.eclipse.xtext.util.IResourceScopeCache;

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
		Collections.reverse(urisAsList);
		IScope scope = IScope.NULLSCOPE;
		for (URI uri : urisAsList) {
			scope = createLazyResourceScope(scope, uri, descriptions, type, filter, ignoreCase);
		}
		return scope;
	}


	protected LinkedHashSet<URI> getImportedUris(final Resource resource, final EObject originalContext) {
		return cache.get(ImportUriGlobalScopeProvider.class.getName(), resource, new Provider<LinkedHashSet<URI>>(){
			public LinkedHashSet<URI> get() {
				TreeIterator<EObject> iterator = resource.getAllContents();
				final LinkedHashSet<URI> uniqueImportURIs = new LinkedHashSet<URI>(10);
				while (iterator.hasNext()) {
					EObject object = iterator.next();
					if(object.equals(originalContext)) {
						break;
					}
					String uri = importResolver.apply(object);
					
					// we should break from this loop when we hit the context object.
					if (uri != null) {
						
						URI importUri = URI.createURI(uri);
						uniqueImportURIs.add(importUri);
					}
				}
				Iterator<URI> uriIter = uniqueImportURIs.iterator();
				while(uriIter.hasNext()) {
					if (!EcoreUtil2.isValidUri(resource, uriIter.next()))
						uriIter.remove();
				}
				return uniqueImportURIs;
			}
		});
	}
	protected IScope createLazyResourceScope(IScope parent, final URI uri, final IResourceDescriptions descriptions,
			EClass type, final Predicate<IEObjectDescription> filter, boolean ignoreCase) {
		IResourceDescription description = descriptions.getResourceDescription(uri);
		return ProjectSelectableBasedScope.createScope(parent, description, filter, type, ignoreCase);
	}


}
