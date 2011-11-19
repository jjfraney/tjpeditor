package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.JournalAttributes;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class JournalAttributesTest extends XtextTest {

	@Test
	public void testNone() {
		testParserRule("journalattributes -", getRule());
	}

	@Test
	public void testAll() {
		testParserRule("journalattributes *", getRule());
	}

	@Test
	public void testSome1() {
		testParserRule("journalattributes flags property details author", getRule());
	}

	@Test
	public void testSome2() {
		testParserRule("journalattributes headline date timesheet", getRule());
	}
	@Test
	public void testSome3() {
		testParserRule("journalattributes propertyid summary", getRule());
	}
	@Test
	public void testSomerepeats() {
		testParserRuleErrors("journalattributes summary summary flags", getRule());
	}


	private String getRule() {
		return JournalAttributes.class.getSimpleName();
	}
}
