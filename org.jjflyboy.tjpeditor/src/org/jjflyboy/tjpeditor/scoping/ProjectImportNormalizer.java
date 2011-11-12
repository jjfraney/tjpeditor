package org.jjflyboy.tjpeditor.scoping;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;


public class ProjectImportNormalizer extends ImportNormalizer {
	private final int steps;
	private static final String BANG = "!";

	public ProjectImportNormalizer(QualifiedName importedNamespace,
			boolean wildCard, boolean ignoreCase, int steps) {
		super(importedNamespace, wildCard, ignoreCase);
		this.steps = steps;
	}
	@Override
	public QualifiedName deresolve(QualifiedName fullyQualifiedName) {
		return super.deresolve(fullyQualifiedName);
	}
	@Override
	public QualifiedName resolve(QualifiedName relativeName) {
		QualifiedName result = null;
		int bangs = countBangs(relativeName);
		if(steps != 0) {
			if(steps == bangs  && steps != 0) {
				relativeName = relativeName.skipFirst(bangs);
				result = super.resolve(relativeName);
			}
		} else {
			result = super.resolve(relativeName);
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
	
	@Override
	public String toString() {
		return super.toString() + ", steps=" + steps;
	}



}
