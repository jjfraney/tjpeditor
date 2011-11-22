package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.StatusTimesheet;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class StatusTimesheetTest  extends XtextTest {
	
	@Test
	public void testAllAttributes() {
		String text = "status red \"red status\" { " +
				"details \"details text\" " +
				"flags f1, f2 " +
				"summary \"summary text\" " +
				"}";
		testParserRule(text, StatusTimesheet.class.getSimpleName());
	}

}
