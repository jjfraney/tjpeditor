package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.TaskTimesheet;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class TaskTimesheetTest  extends XtextTest {
	
	@Test
	public void testAllAttributes() {
		String text = "task redtask { " +
				"end 2010-08-07 " +
				"priority 5 " +
				"remaining 9 y " +
				"status red \"red status\" " +
				"work 3.3 % " +
				"}";
		testParserRule(text, TaskTimesheet.class.getSimpleName());
	}

}
