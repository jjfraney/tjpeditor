package org.jjflyboy.tjpeditor.validation;

import org.eclipse.xtext.validation.Check;
import org.jjflyboy.tjpeditor.project.Global;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
 

public class ProjectJavaValidator extends AbstractProjectJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
	@Check
	public void checkProjectPropertyForResource(Global global) {
		String ext = global.eResource().getURI().fileExtension();
		if("tjp".equals(ext) && global.getProject() == null) {
			error("A *.tjp file must have a 'project' property.", ProjectPackage.eINSTANCE.getGlobal_Project());
		} else if("tji".equals(ext) && global.getProject() != null) {
			error("A *.tji file must not have a 'project' property.", ProjectPackage.eINSTANCE.getGlobal_Project());
		}
	}
	

}
