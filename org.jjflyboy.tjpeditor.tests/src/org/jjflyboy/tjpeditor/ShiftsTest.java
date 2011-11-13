package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class ShiftsTest  extends XtextTest {
	@Test
	public void testShiftsLimit() {
		testParserRule("s1 2010-01-16-9:30 - 2011-01-16-20:59", "ShiftsLimit");
	}
	@Test
	public void testShiftsAllocate() {
		testParserRule("shifts s1", "ShiftsAllocate");
	}
	@Test
	public void testShiftsAllocateWithInterval() {
		testParserRule("shifts s1 2010-01-16 + 4 m", "ShiftsAllocate");
	}
	@Test
	public void testShiftsAllocateWithTwoIntervals() {
		testParserRule("shifts s1 2010-01-16 + 4 m, 2010-01-16 - 2011-01-16", "ShiftsAllocate");
	}
	
	@Test
	public void testShiftsResource() {
		testParserRule("shifts s1 ", "ShiftsResource");
	}
	@Test
	public void testShiftsResource2() {
		testParserRule("shifts s1,s2", "ShiftsResource");
	}
	@Test
	public void testShiftsResourceWithInterval() {
		testParserRule("shifts s1 2010-01-16-9:30 - 2011-01-16-20:59, s2", "ShiftsResource");
	}
	@Test
	public void testShiftsTask() {
		testParserRule("shifts s1 ", "ShiftsTask");
	}
	@Test
	public void testShiftsTask2() {
		testParserRule("shifts s1,s2", "ShiftsTask");
	}
	@Test
	public void testShiftsTaskWithInterval() {
		testParserRule("shifts s1 2010-01-16-9:30 - 2011-01-16-20:59, s2", "ShiftsTask");
	}


}
