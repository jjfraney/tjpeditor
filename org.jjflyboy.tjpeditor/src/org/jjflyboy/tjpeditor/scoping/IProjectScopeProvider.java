package org.jjflyboy.tjpeditor.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

public interface IProjectScopeProvider {

	/**
	 * Returns a scope for the given context. The scope provides access to the compatible
	 * visible EObjects for a given reference.
	 * <p>
	 * Because the method {@link  IScopeProvider#getScope(EObject, EReference)} is invoked recursively, the original
	 * element containing the reference is lost to deeper calls.  In Project, this element is needed because
	 * only definitions that appear BEFORE the reference are in scope.
	 *
	 * @param context the element from which an element shall be referenced. It doesn't need to be the element
	 * 		  containing the reference, it is just used to find the most inner scope for given {@link EReference}.
	 * @param reference the reference for which to get the scope.
	 * @param originalContext the original element from which an element shall be referenced.  This IS the
	 * 	element containing the reference.
	 * @return {@link IScope} representing the inner most {@link IScope} for the
	 *         passed context and reference. Note for implementors: The result may not be <code>null</code>.
	 *         Return <code>IScope.NULLSCOPE</code> instead.
	 */

		IScope getScope(EObject context, EReference reference, EObject originalContext);
}
