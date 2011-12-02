package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.NikuReport;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class NikuReportTest extends XtextTest {
	public NikuReportTest() {
		super("NikuReportTest");
	}
	
	@Test
	public void testAllAttributes() {
		String text = "nikureport  \"Report One\" {" +
				"end 2007-07-07 " +
				"formats csv, html " +
				"headline \"headline text\" " +
				"hideresource \"logical expression\" " +
				"hidetask \"logical expression\" " +
				"numberformat \"-\" \"\" \".\" \",\" 2" +
				"period 2010-01-16 + 4 m " +
				"start 2007-07-07 " +
				"timeoff \"nikutime\" \"Post Time\" " +
				"title \"title text\" " +
				"}";
		testParserRule(text, NikuReport.class.getSimpleName());
	}
	

}
