package org.jjflyboy.tjpeditor.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;

public class ProjectImportScope extends ImportScope {

	public ProjectImportScope(List<ImportNormalizer> namespaceResolvers,
			IScope parent, ISelectable importFrom, EClass type,
			boolean ignoreCase) {
		
		super(namespaceResolvers, parent, importFrom, type, ignoreCase);
	}
	
	public IEObjectDescription getSingleElement(QualifiedName name) {
		
		IEObjectDescription result = null;

		ProjectQualifiedName searchname;
		if(name instanceof ProjectQualifiedName) {
			searchname = (ProjectQualifiedName)name;
		} else {
			searchname = new ProjectQualifiedName(name);
		}
		
		// To find a name in this scope, the name MUST be a relative name
		if(searchname.getFirstSegment().equals(ProjectQualifiedName.UPDIR)) {
			searchname.advance();
			
			// after advance, a name with '!' first cannot be found in this scope,
			// look in the next higher scope
			if(searchname.getFirstSegment().equals(ProjectQualifiedName.UPDIR)) {
				result = getParent().getSingleElement(searchname);
			} else {
				result = getSingleLocalElementByName(searchname);
			}
		} else {
			// non-relative names will be found in resource scopes
			result = getParent().getSingleElement(searchname);
		}
		return result;
	}
}
