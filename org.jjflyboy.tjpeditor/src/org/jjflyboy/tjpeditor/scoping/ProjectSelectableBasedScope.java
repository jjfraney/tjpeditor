package org.jjflyboy.tjpeditor.scoping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;

import com.google.common.base.Predicate;

public class ProjectSelectableBasedScope extends SelectableBasedScope {
	
	public static IScope createScope(IScope outer, ISelectable selectable, EClass type, boolean ignoreCase) {
		return createScope(outer, selectable, null, type, ignoreCase);
	}
	
	public static IScope createScope(IScope outer, ISelectable selectable, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		if (selectable == null || selectable.isEmpty())
			return outer;
		return new ProjectSelectableBasedScope(outer, selectable, filter, type, ignoreCase);
	}

	protected ProjectSelectableBasedScope(IScope outer, ISelectable selectable,
			Predicate<IEObjectDescription> filter, EClass type,
			boolean ignoreCase) {
		super(outer, selectable, filter, type, ignoreCase);
	}
	
	public IEObjectDescription getSingleElement(QualifiedName name) {
		
		IEObjectDescription result = null;

		ProjectQualifiedName searchname;
		if(name instanceof ProjectQualifiedName) {
			searchname = (ProjectQualifiedName)name;
		} else {
			searchname = new ProjectQualifiedName(name);
		}
		
		// either absolute name or relative with one '!' can be found in
		// this scope or parents.
		// To find a name in this scope, the name MUST be a relative name
		if(searchname.getFirstSegment().equals(ProjectQualifiedName.UPDIR)) {
			searchname.advance();
		}
		
		// only non-relative names from this point on
		if(!searchname.getFirstSegment().equals(ProjectQualifiedName.UPDIR)) {
			result = getSingleLocalElementByName(searchname);
			if(result == null) {
				result = getParent().getSingleElement(searchname);
			}
		} 
		return result;
	}
	

}
