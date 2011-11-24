package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class TjiFileTest  extends XtextTest {
	public TjiFileTest() {
		super("TjiFileTest");
	}
	
	@Test 
	public void testTjiFileNoProject() {
		ignoreFormattingDifferences();
		testFile("TjiFileNoProject.tji");
	}
	
	@Test 
	public void testTjiFileWithProject() {
		ignoreFormattingDifferences();
		assertConstraints(testFileNoSerializer("TjiFileWithProject.tji")
				.nOfThemContain(1, "A *.tji file must not have a 'project' property."));
		
	}
	@Test 
	public void testTjpFileNoProject() {
		ignoreFormattingDifferences();
		assertConstraints(testFileNoSerializer("TjpFileNoProject.tjp")
				.nOfThemContain(1, "A *.tjp file must have a 'project' property."));
	}
	

}
