package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner.class)
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
