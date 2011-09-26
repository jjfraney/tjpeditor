package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner.class)
public class LimitsTest extends XtextTest {

	@Test
	public void testDailyMaxLimits() {
		testParserRule("limits { dailymax 2h weeklymax 6h monthlymax 2.5d }", "Limits");
	}
	
	@Test
	public void testCompoundLimits() {
		testParserRule("limits { maximum 4h { end 2011-10-10 start 2011-10-10 } weeklymax 6h }",
				"Limits");
	}
	
}
