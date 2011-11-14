package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class DefinitionsTest  extends XtextTest {
	
	
	@Test 
	public void testNone() {
		testParserRule("definitions - ", "Definitions");
	}
	@Test 
	public void testAll() {
		testParserRule("definitions * ", "Definitions");
	}
	@Test 
	public void testEmpty() {
		testParserRule("definitions", "Definitions");
	}
	@Test 
	public void testSomeEnumerated() {
		testParserRule("definitions flags tasks project", "Definitions");
	}
	@Test 
	public void testAllEnumerated() {
		testParserRule("definitions flags resources tasks project projectids", "Definitions");
	}
	@Test 
	public void testEnumeratedOnlyOnce() {
		testParserRuleErrors("definitions flags flags", "Definitions");
	}

}
