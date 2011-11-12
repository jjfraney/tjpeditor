package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class BookingTest  extends XtextTest {
	
	
	@Test 
	public void testResourceBooking() {
		testParserRule("booking testresource 2007-01-08-13:00 +4h", "BookingResource");
	}

	@Test 
	public void testTasBooking() {
		testParserRule("booking testtask 2007-01-08-3:00 +4h", "BookingTask");
	}

}
