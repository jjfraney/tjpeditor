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
	
	private int steps;
	private static final String BANG = "!";

	public static IScope createScope(IScope outer, ISelectable selectable, EClass type, boolean ignoreCase, int steps) {
		return createScope(outer, selectable, null, type, ignoreCase, steps);
	}
	
	public static IScope createScope(IScope outer, ISelectable selectable, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase, int steps) {
		if (selectable == null || selectable.isEmpty())
			return outer;
		return new ProjectSelectableBasedScope(outer, selectable, filter, type, ignoreCase, steps);
	}

	protected ProjectSelectableBasedScope(IScope outer, ISelectable selectable,
			Predicate<IEObjectDescription> filter, EClass type,
			boolean ignoreCase, int steps) {
		super(outer, selectable, filter, type, ignoreCase);
		this.steps = steps;
	}
	
	@Override
	protected Iterable<IEObjectDescription> getLocalElementsByName(final QualifiedName name) {
		Iterable<IEObjectDescription> result;
		if(steps != 0) {
			int bangs = countBangs(name);
			if(steps == bangs) {
				result = super.getLocalElementsByName(name.skipFirst(bangs));
			} else {
				result = Collections.emptyList();
			}
		} else {
			result = super.getLocalElementsByName(name);
		}
		return result;
	}

	private int countBangs(QualifiedName name) {
		int count = 0;
		for(String segment : name.getSegments()) {
			if(segment.equals(BANG)) {
				count ++;
			} else {
				break;
			}
		}
		return count;
	}

}
