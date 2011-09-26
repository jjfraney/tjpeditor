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
	public void simpleProjectZeroAttributesTest() {
		testFile("simpleProjectZeroAttributes.tjp");
	}
	
	@Test
	public void simpleProjectMissingAttributesTest() {
		testFile("simpleProjectMissingAttributes.tjp");
	}

	@Test
	public void simpleProjectMissingIdTest() {
		testFile("simpleProjectMissingId.tjp");
	}

}
