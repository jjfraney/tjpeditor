package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class VacationTest extends XtextTest {

	@Test
	public void testVacationOption1() {
		testParserRule("vacation \"summer\" 2010-01-16 + 4 w", "Vacation");
	}
	@Test
	public void testVacationOption2() {
		testParserRuleErrors("vacation 2010-01-16 + 4 w", "Vacation", "missing RULE_STRING");
	}
	@Test
	public void testVacationOption3() {
		testParserRuleErrors("vacation \"summer\"", "Vacation", "expecting RULE_ISODATE");
	}

	@Test
	public void testVacationOption4() {
		testParserRuleErrors("vacation", "Vacation", "expecting RULE_STRING");
	}
	
	@Test
	public void testVacationShiftOption1() {
		testParserRule("vacation \"summer\" 2010-01-16 + 4 w", "VacationShift");
	}
	@Test
	public void testVacationShiftOption2() {
		testParserRule("vacation 2010-01-16 + 4 w", "VacationShift");
	}
	@Test
	public void testVacationShiftOption3() {
		testParserRule("vacation \"summer\"", "VacationShift");
	}

	@Test
	public void testVacationShiftOption4() {
		testParserRule("vacation", "VacationShift");
	}
	@Test
	public void testVacationResourceOption1() {
		testParserRule("vacation \"summer\" 2010-01-16 + 4 w", "VacationResource");
	}
	@Test
	public void testVacationResourceOption2() {
		testParserRule("vacation 2010-01-16 + 4 w", "VacationResource");
	}
	@Test
	public void testVacationResourceOption3() {
		testParserRuleErrors("vacation \"summer\"", "VacationResource", "expecting RULE_ISODATE");
	}

	@Test
	public void testVacationResourceOption4() {
		testParserRuleErrors("vacation", "VacationResource", "expecting RULE_ISODATE");
	}

	
}
