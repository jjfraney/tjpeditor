package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.Global;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class GlobalTest extends XtextTest {
	public GlobalTest() {
		super("GlobalTest");
	}
	
	@Test
	public void testAllAttributes() {
		String text = "project ppp \"my proejct\"  2002-01-16 +4m { } " +
				"account ac1 \"cost\" " +
				"balance c1 c2 " +
				"copyright \"copy right text \" " +
				"export ex1 \"exportfile.tji\" " +
				"flags s3, s4 " +
				"icalreport \"ical.tji\" " +
				// TODO: "include \"incl.tji\" " +
				"limits " +
				// TODO: "macro FOO [ text for FOO ] " +
				"navigator n1 " +
				"nikureport \"niku.tji\" " +
				"projectids id2 " +
				"rate 3.3 " +
				"accountreport r1 \"report one\" " +
				"resourcereport r1 \"report one\" " +
				"taskreport r1 \"report one\" " +
				"textreport r1 \"report one\" " +
				"resource res1 \"resource one\" " +
				"shift shift3 \"shift three\" " +
				"statussheet res1 2010-01-16 + 4 m " +
				"statussheetreport \"report.tji\" " +
				"supplement account ac1 " +
				"supplement report rep1 " +
				"supplement task task1 " +
				"tagfile tag1 \"tagfile.tji\" " +
				"task task1 \"task one\" " +
				"timesheet res1 2010-01-16 + 4 m " +
				"timesheetreport \"tsreport.tji\" " +
				"vacation \"summer\" 2010-01-16 - 2011-01-16"  +
				" ";
		testParserRule(text, Global.class.getSimpleName());
	}
	

}
