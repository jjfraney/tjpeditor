package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class Interval1Test  extends XtextTest {
	
	
	@Test 
	public void testInterval1Duration() {
		testParserRule("2010-01-16 + 4 m", "Interval1");
	}
	@Test 
	public void testInterval1End() {
		testParserRule("2010-01-16 - 2011-01-16", "Interval1");
	}

}
