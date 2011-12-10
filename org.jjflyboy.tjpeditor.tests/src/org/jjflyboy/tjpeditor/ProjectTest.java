package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.Project;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class ProjectTest extends XtextTest {
	public ProjectTest() {
		super("ProjectTest");
	}
	
	@Test
	public void simpleProjectZeroAttributesTest() {
		testFile("simpleProjectZeroAttributes.tjp");
	}
	
	@Test
	public void simpleProjectMissingAttributesTest() {
		testFile("simpleProjectMissingAttributes.tjp");
	}

	@Test
	public void simpleProjectMissingIdTest() {
		testFile("simpleProjectMissingId.tjp");
	}

	@Test
	public void testAllAttributes() {
		String text = "project acso \"Accounting Software\" 2010-01-16 + 4 m {" +
				"currency \"USD\"  " +
				"currencyformat \"(\" \")\" \",\" \".\" 2 " +
				" dailyworkinghours 8 " +
				"extend task " +
				"include \"file.tji\" " +
				"journalentry 2001-10-10 \"journal headline\" " +
				"now 2010-10-10 " +
				"numberformat \"(\" \")\" \",\" \".\" 2 " +
				"scenario one \"One\" " +
				"shorttimeformat \"format\" " +
				"timeformat \"format\" " +
				"timezone \"America/New_York\" " +
				"timingresolution 5 min " +
				"trackingscenario one " +
				"weekstartsmonday " +
				"weekstartssunday " +
				"workinghours sat, sun off " +
				"yearlyworkingdays 13 " +
		"}";
		testParserRule(text, Project.class.getSimpleName());

	}
	
}
