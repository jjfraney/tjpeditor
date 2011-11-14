package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.ResourceAttributes;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class ResourceAttributesTest extends XtextTest {

	@Test
	public void testNone() {
		testParserRule("resourceattributes - ", getRule());
	}

	@Test
	public void testAll() {
		testParserRule("resourceattributes * ", getRule());
	}

	@Test
	public void testEmpty() {
		testParserRule("resourceattributes", getRule());
	}

	@Test
	public void testSomeEnumerated() {
		testParserRule("resourceattributes booking workinghours", getRule());
	}

	@Test
	public void testAllEnumerated() {
		testParserRule(
				"resourceattributes vacation booking workinghours",
				getRule());
	}

	@Test 
	public void testEnumeratedOnlyOnce() {
		testParserRuleErrors("resourceattributes vacation vacation", getRule());
	}

	private String getRule() {
		return ResourceAttributes.class.getSimpleName();
	}
}
