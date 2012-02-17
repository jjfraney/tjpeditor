package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class LogicalExpressionTest  extends XtextTest {
	
	
	@Test 
	public void test() {
		testParserRule("5", "LogicalExpression");
	}
	
	@Test 
	public void testTrue() {
		testParserRule("true", "LogicalExpression");
	}
	
	@Test 
	public void testStringAndNumeric() {
		testParserRule("\"aString\" <= 9.9", "LogicalExpression");
	}
	@Test 
	public void testIsoDate() {
		testParserRule("2010-01-16-12:20:30 | 2010-01-16-15:20:30", "LogicalExpression");
	}
	@Test 
	public void testParenthesized() {
		testParserRule("((true & false) & \"aString\") | (10.9)", "LogicalExpression");
	}
	
	@Test 
	public void testAbsoluteId() {
		testParserRule("scenario_4.field", "LogicalExpression");
	}
	@Test 
	public void testEquality() {
		testParserRule("scenario_4.field = 7", "LogicalExpression");
	}
	@Test 
	public void testFunction() {
		testParserRule("isleaf() | ismilestone(today)", "LogicalExpression");
	}
	
	@Test
	public void testAFunction() {
		testParserRule("isleaf() | ischildof(mine)", "LogicalExpression");
	}

}
