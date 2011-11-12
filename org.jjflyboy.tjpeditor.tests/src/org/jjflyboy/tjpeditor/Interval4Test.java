package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class Interval4Test  extends XtextTest {
	
	
	@Test 
	public void testInterval4Duration() {
		testParserRule("2010-01-16 + 4 m", "Interval4");
	}
	@Test 
	public void testInterval4TimeOfDayDuration() {
		testParserRule("2010-01-16-10:30 + 4 m", "Interval4");
	}
	@Test 
	public void testInterval4TimeOfDayAndDuration() {
		testParserRule("2010-01-16-3:00 + 4h", "Interval4");
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
