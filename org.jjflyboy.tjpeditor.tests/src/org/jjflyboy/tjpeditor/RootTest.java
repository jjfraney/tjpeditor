package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class RootTest extends XtextTest {

	public RootTest() {
		super("RootTest");
	}
	
	@Test
	public void taskrootTest() {
		ignoreFormattingDifferences();
		assertConstraints(testFileNoSerializer("taskrootTest.tjp")
				.nOfThemContain(2, "Couldn't resolve reference to Task"));
	}
	
	@Test
	public void accountrootTest() {
		ignoreFormattingDifferences();
		assertConstraints(testFileNoSerializer("accountrootTest.tjp")
				.nOfThemContain(1, "Couldn't resolve reference to Account"));

	}
	
	@Test
	public void resourcerootTest() {
		ignoreFormattingDifferences();
		assertConstraints(testFileNoSerializer("resourcerootTest.tjp")
				.nOfThemContain(1, "Couldn't resolve reference to Resource"));

	}

}
