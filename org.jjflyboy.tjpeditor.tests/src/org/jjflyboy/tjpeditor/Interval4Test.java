package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner.class)
public class Interval4Test  extends XtextTest {
	
	
	@Test 
	public void testInterval4Duration() {
		testParserRule("2010-01-16 + 4 m", "Interval4");
	}
	@Test 
	public void testInterval4End() {
		testParserRule("2010-01-16 - 2011-01-16", "Interval4");
	}
	@Test 
	public void testInterval4StartDateOnly() {
		testParserRule("2010-01-16", "Interval4");
	}

}
