package org.jjflyboy.tjpeditor.scoping;

import static java.util.Collections.singletonList;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.jjflyboy.tjpeditor.project.Global;
import org.jjflyboy.tjpeditor.project.TaskDependency;

/**
 * The point of this provider is to build scopes that are aware of the relative
 * identifier used on task dependency and to resolve them.
 * 
 * TODO: Evaluate and make this work with xtext imports.
 * 
 * @author john
 *
 */
public class ProjectImportedNamespaceAwareLocalScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {

	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		// no namespace for task dependency or of its task
		if(context instanceof TaskDependency) {
			return getScope(context.eContainer().eContainer(), reference);
		} else {
			return super.getScope(context, reference);
		}

	}
	
	@Override
	protected IScope getResourceScope(final IScope parent, final EObject context, final EReference reference) {
		// TODO: SZ - context may not be a proxy, may it?
		if (context.eResource() == null)
			return parent;
		ISelectable allDescriptions = getAllDescriptions(context.eResource());
		return ProjectSelectableBasedScope.createScope(parent, allDescriptions, reference.getEReferenceType(), isIgnoreCase(reference));
	}

	@Override
	protected ImportScope createImportScope(IScope parent,
			List<ImportNormalizer> namespaceResolvers, ISelectable importFrom,
			EClass type, boolean ignoreCase) {
		
		return new ProjectImportScope(namespaceResolvers, parent, importFrom, type, ignoreCase);
	}

}
