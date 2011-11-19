package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.TaskReport;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class ReportTest extends XtextTest {
	public ReportTest() {
		super("ReportTest");
	}
	
	@Test
	public void testAllAttributes() {
		String text = "taskreport r1 \"Report One\" {" +
				"accountroot aroot " +
				"balance ac1 ac2 " + 
				"caption \"cap string\" " +
				"center \"cent string\" " +
				"columns alert width 10.1  " +
				"currencyformat \"(\" \")\" \",\" \".\" 2 " +
				"end 2011-08-11 " +
				"epilog \"epi string\" " +
				"flags f1, f2 " + 
				"footer \"foot string\" " +
				"formats csv, html " +
				"header \"head string\" " +
				"headline \"headline string\" " +
				"hideaccount \"logical expression\" " +
				"hidejournalentry \"logical expression\" " +
				"hideresource \"logical expression\" " +
				"hidetask \"logical expression\" " +
				"journalattributes * " +
				"journalmode journal " +
				"left \"left string\" " +
				"loadunit days " +
				"numberformat \"(\" \")\" \",\" \".\" 2 " +
				"period 2010-01-16-9:30 - 2011-01-16-20:59 " +
				"prolog \"prolog string\" " +
				"purge columns " +
				"accountreport \"acr\" " +
				"resourcereport \"rcr\" " +
				"taskreport \"tacr\" " +
				"textreport \"tecr\" " +
				"resourceroot rroot " +
				"right \"right string\" " +
				"rollupaccount \"logical expression\" " +
				"rollupresource \"logical expression\" " +
				"rolluptask \"logical expression\" " +
				"scenarios sc1,sc2,sc3 " +
				"selfcontained no " +
				"sortaccounts tree, alert.up " +
				"sortjournalentries duties.down " +
				"sortresources alert.down, duties.down " +
				"sorttasks tree " +
				"start 2010-08-09 " +
				"taskroot t1.t3 " +
				"timeformat \"format\" " +
				"timezone \"tz\" " +
				"title \"title string\" " +
				"}";
		testParserRule(text, TaskReport.class.getSimpleName());
	}
	

}
