package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.Timesheet;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class TimesheetTest  extends XtextTest {
	
	@Test
	public void testAllAttributes() {
		String text = "timesheet res1 2010-01-16 + 4 m { " +
				"newtask task1 \"a new task\" "  +
				"shift shift5 " +
				"status red \"red status\" " +
				"task task3 " +
				"}";
		testParserRule(text, Timesheet.class.getSimpleName());
	}

}
