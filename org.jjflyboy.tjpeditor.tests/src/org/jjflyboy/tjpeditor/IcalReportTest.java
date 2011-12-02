package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.IcalReport;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class IcalReportTest extends XtextTest {
	public IcalReportTest() {
		super("IcalReportTest");
	}
	
	@Test
	public void testAllAttributes() {
		String text = "icalreport \"Report One\" {" +
				"end 2011-08-11 " +
				"hidejournalentry \"logical expression\" " +
				"hideresource \"logical expression\" " +
				"hidetask \"logical expression\" " +
				"period 2010-01-16-9:30 - 2011-01-16-20:59 " +
				"rollupresource \"logical expression\" " +
				"rolluptask \"logical expression\" " +
				"scenario sc1 " +
				"start 2010-08-09 " +
				"}";
		testParserRule(text, IcalReport.class.getSimpleName());
	}
	

}
