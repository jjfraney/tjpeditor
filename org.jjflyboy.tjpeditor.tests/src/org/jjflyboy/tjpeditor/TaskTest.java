package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.FluentIssueCollection;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.Task;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class TaskTest extends XtextTest {
	public TaskTest() {
		super("TaskTest");
	}
	
	@Test
	public void testAllAttributes() {
		String text = "task t1 \"Task One\" {" +
				" allocate res1 " +
				"booking testresource 2007-01-08-13:00 +4h " +
				"charge 1.2 perday " +
				"chargeset account5 40 " +
				"\n" +
				"complete 20 " +
				"depends task4 " +
				"duration 5 min " +
				"effort 4 w " +
				"end 2011-06-30 " +
				"endcredit 5 " +
				"\n" +
				"fail \" some logical expression \" " +
				"flags flag23  " +
				"journalentry 2011-11-12 \"T2.1 Yellow\" { alert red summary \"yes er jsbr dp,r yrcy\" } " +
				"length 10 w " +
				"limits { weeklymax 2d } " +
				"maxend 2008-01-09 " +
				"maxstart 2011-01-09 " +
				"milestone " +
				"minend 2012-01-09 " +
				"minstart 2010-01-09 " +
				"note \"this is a note\" " +
				"period 2010-01-16 + 4 m " +
				"precedes junktask " +
				"priority 10 " +
				"projectid proj " +
				"purge projected " +
				"responsible fred " +
				"scheduled " +
				"scheduling alap " +
				"shifts shiftA 2010-01-16 + 4 m " +
				"start 2010-01-19 " +
				"supplement task tough.one " +
				"task subtask \"Sub task\" " +
				"warn \"logical expression\" " +
				"}";
		testParserRule(text, Task.class.getSimpleName());
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
