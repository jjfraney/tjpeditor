package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner.class)
public class WorkingHoursTest extends XtextTest {

	@Test
	public void testWorkingHoursSampleOne() {
		testParserRule("workinghours mon - fri 9:00 - 12:00, 13:00 - 18:00", "WorkingHours");
	}
	
	@Test
	public void testWorkingHoursSampleTwo() {
		testParserRule("workinghours sat, sun off", "WorkingHours");
	}
	
}
