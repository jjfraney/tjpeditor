package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.FluentIssueCollection;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class TaskTest extends XtextTest {
	public TaskTest() {
		super("TaskTest");
	}
	
	@Test
	public void taskDependsRootReferenceTest() {
		ignoreFormattingDifferences();
		testFile("taskDependsRootReference.tjp");
	}
	
	@Test
	public void taskDependsDeepReferenceTest() {
		ignoreFormattingDifferences();
		testFile("taskDependsDeepReference.tjp");
	}
	
	@Test
	public void taskDependsRelativeReferenceToGlobalTest() {
		ignoreFormattingDifferences();
		testFileNoSerializer("taskDependsRelativeReferenceToGlobal.tjp");
	}
	@Test
	public void taskDependsDeepRelativeReferenceToMiddleTest() {
		ignoreFormattingDifferences();
		testFileNoSerializer("taskDependsDeepRelativeReferenceToMiddle.tjp");
	}
	@Test
	public void taskDependsBrokenRelativeReferenceNoBangsTest() {
		ignoreFormattingDifferences();
		assertConstraints(testFileNoSerializer("taskDependsBrokenRelativeReferenceNoBangs.tjp")
			.oneOfThemContains("Couldn't resolve reference to Task 'middle1.bottom1'"));
	}
	@Test
	public void taskDependsBrokenRelativeReferenceTooManyBangsTest() {
		ignoreFormattingDifferences();
		assertConstraints(testFileNoSerializer("taskDependsBrokenRelativeReferenceTooManyBangs.tjp")
			.oneOfThemContains("Couldn't resolve reference to Task '!!!!!!middle1.bottom1'"));
	}

}
