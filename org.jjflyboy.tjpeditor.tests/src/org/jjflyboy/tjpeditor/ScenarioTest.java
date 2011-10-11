package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class ScenarioTest  extends XtextTest {
	
	
//	@Test 
	public void testWithIdAndName() {
		testParserRule("scenario ten \"Tenth scenario\"", "Scenario");
	}
	@Test 
	public void testActive() {
		testParserRule("scenario ten \"Tenth scenario\" { active yes }", "Scenario");
	}
	
	@Test 
	public void testActiveNested() {
		testParserRule("scenario ten \"Tenth scenario\" { active yes scenario subten \"SubTen Scenario\" { active no } }", "Scenario");
	}

}
