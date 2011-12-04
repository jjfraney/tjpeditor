package org.jjflyboy.tjpeditor.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IContainer.Manager;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;

import com.google.common.base.Predicate;

public interface IProjectGlobalScopeProvider {
	/**
	 * Returns a global scope for the given context. The scope provides access to the
	 * {@link EObjectDescription} visible from the given ecore {@link Resource}
	 * according to the definition of the global scope hierarchy (which is usually defined by 
	 * {@link Manager}).
	 * <p>
	 * Because the method {@link  IGlobalScopeProvider#getScope(Resource, EReference, Predicate)} is invoked recursively, the original
	 * element containing the reference is lost to deeper calls.  In Project, this element is needed because
	 * only definitions that appear BEFORE the reference are in scope.
	 *
	 * @param context the resource from which the global scope is looked at.
	 * @param the reference for which to construct a global scope.
	 * @param a filter used to filter down the elements contained in each scope. Scopes will only contain elements for which the filter returned <code>true</code>.
	 * @param originalContext the original element from which an element shall be referenced.  This IS the
	 * 	element containing the reference.
	 * @return {@link IScope} representing the inner most {@link IScope} for the
	 *         passed context and reference. Note for implementors: The result may not be <code>null</code>.
	 *         Return <code>IScope.NULLSCOPE</code> instead.
	 */
	IScope getScope(Resource context, EReference reference, Predicate<IEObjectDescription> filter, EObject originalContext);

}
