package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.TimesheetReport;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class TimesheetReportTest  extends XtextTest {
	
	@Test
	public void testAllAttributes() {
		String text = "timesheetreport \"tsreport.tji\" { " +
				"end 2011-08-08 " +
				"hideresource \"logical expression\" " +
				"period 2010-01-16-9:30 - 2011-01-16-20:59 " +
				"start 2011-09-09 " +
				"}";
		testParserRule(text, TimesheetReport.class.getSimpleName());
	}

}
