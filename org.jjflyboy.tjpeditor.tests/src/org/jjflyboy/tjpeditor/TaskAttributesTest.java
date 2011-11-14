package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.TaskAttributes;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class TaskAttributesTest extends XtextTest {

	@Test
	public void testNone() {
		testParserRule("taskattributes - ", getRule());
	}

	@Test
	public void testAll() {
		testParserRule("taskattributes * ", getRule());
	}

	@Test
	public void testEmpty() {
		testParserRule("taskattributes", getRule());
	}

	@Test
	public void testSomeEnumerated() {
		testParserRule("taskattributes flags maxstart priority booking", getRule());
	}

	@Test
	public void testAllEnumerated() {
		testParserRule(
				"taskattributes flags maxstart maxend priority booking note minstart minend complete depends",
				getRule());
	}

	@Test 
	public void testEnumeratedOnlyOnce() {
		testParserRuleErrors("taskattributes booking booking", getRule());
	}

	private String getRule() {
		return TaskAttributes.class.getSimpleName();
	}
}
