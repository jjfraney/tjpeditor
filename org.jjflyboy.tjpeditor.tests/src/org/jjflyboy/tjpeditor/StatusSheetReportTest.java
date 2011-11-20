package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.StatusSheetReport;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class StatusSheetReportTest  extends XtextTest {
	
	@Test
	public void testAllAttributes() {
		String text = "statussheetreport \"report.tji\" { " +
				"end 2011-09-11 " +
				"hideresource \"logical expression\" " +
				"hidetask \"logical expression\" " +
				"period 2010-01-16 + 4 m " +
				"sortresources tree " +
				"sorttasks tree " +
				"start 2011-10-11 " +
				"} ";
		testParserRule(text, StatusSheetReport.class.getSimpleName());
	}
	
	@Test
	public void testAllAttributesMixed() {
		String text = "statussheetreport \"report.tji\" { " +
				"period 2010-01-16 + 4 m " +
				"sortresources tree " +
				"hidetask \"logical expression\" " +
				"sorttasks tree " +
				"start 2011-10-11 " +
				"end 2011-09-11 " +
				"hideresource \"logical expression\" " +
				"start 2012-10-11 " +
				"} ";
		testParserRule(text, StatusSheetReport.class.getSimpleName());
	}

}
