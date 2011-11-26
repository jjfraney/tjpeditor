package org.jjflyboy.tjpeditor.scoping;

import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;

import com.google.common.base.Predicate;

public class ProjectSelectableBasedScope extends SelectableBasedScope {
	
	private static final String BANG = "!";

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
	
	@Override
	protected Iterable<IEObjectDescription> getLocalElementsByName(final QualifiedName name) {

		ProjectQualifiedName searchname;
		if(name instanceof ProjectQualifiedName) {
			searchname = (ProjectQualifiedName)name;
		} else {
			searchname = new ProjectQualifiedName(name);
		}
		
		Iterable<IEObjectDescription> result = Collections.emptyList();
		
		// an absolute or a relative name (with one last '!') can be found here.
		if(searchname.getFirstSegment().equals(ProjectQualifiedName.UPDIR)) {
			searchname.advance();
			
			if(! searchname.getFirstSegment().equals(ProjectQualifiedName.UPDIR)) {
				result = super.getLocalElementsByName(searchname);
			}
		} else {
			result = super.getLocalElementsByName(name);
		}
		return result;
	}


}
