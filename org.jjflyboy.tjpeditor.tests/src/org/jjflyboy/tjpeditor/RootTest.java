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
		testFileNoSerializer("taskrootTest.tjp");
		assertConstraints(
				  issues.errorsOnly()
				        .inLine(14)
				        .oneOfThemContains("Couldn't resolve reference to Task 'notask'")
				);
	}
	
	@Test
	public void accountrootTest() {
		ignoreFormattingDifferences();
		testFileNoSerializer("accountrootTest.tjp");
		assertConstraints(
				  issues.errorsOnly()
				        .inLine(15)
				        .oneOfThemContains("Couldn't resolve reference to Account 'noaccount'")
				);

	}
	
	@Test
	public void resourcerootTest() {
		ignoreFormattingDifferences();
		testFileNoSerializer("resourcerootTest.tjp");
		assertConstraints(
				  issues.errorsOnly()
				        .inLine(15)
				        .oneOfThemContains("Couldn't resolve reference to Resource 'nonesuch'")
				);

	}

}
