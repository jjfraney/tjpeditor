/*
 * generated by Xtext
 */
package org.jjflyboy.tjpeditor.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ProjectExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.jjflyboy.tjpeditor.ui.internal.ProjectActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.jjflyboy.tjpeditor.ui.internal.ProjectActivator.getInstance().getInjector("org.jjflyboy.tjpeditor.Project");
	}
	
}
