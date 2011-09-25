package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.eclipse.xtext.junit4.XtextRunner;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ProjectTest extends XtextTest {
	public ProjectTest() {
		super("ProjectTest");
	}
	
	@Test
	public void simpleProjectTest() {
		testFile("simpleProject.tjp");
	}

}
