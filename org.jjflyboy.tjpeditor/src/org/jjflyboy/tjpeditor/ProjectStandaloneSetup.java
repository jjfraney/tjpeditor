
package org.jjflyboy.tjpeditor;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ProjectStandaloneSetup extends ProjectStandaloneSetupGenerated{

	public static void doSetup() {
		new ProjectStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

