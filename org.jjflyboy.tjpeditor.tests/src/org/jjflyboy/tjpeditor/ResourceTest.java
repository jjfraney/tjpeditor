package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class ResourceTest  extends XtextTest {
	
	
	public ResourceTest() {
		super("ResourceTest");
	}


	@Test 
	public void testResource() {
		testParserRule("resource res1 \"Test resource\"");
	}
	
	@Test
	public void testResourceWithBooking() {
		testParserRule("resource res1 \"Test resource\" { booking test 2007-01-08-13:00 +4h }");
	}
	
	@Test
	public void testResourceWithEfficiency() {
		testParserRule("resource res1 \"Test resource\" { efficiency 4.5 }");
	}
	@Test
	public void testResourceWithEmail() {
		testParserRule("resource res1 \"Test resource\" { email \"someone@somehere.com\"}");
	}
	
	@Test
	public void testResourceWithFail() {
		testParserRule("resource res1 \"Test resource\" { fail \"not supported\"}");
	}
	private void testParserRule(String textToParse) {
		testParserRule(textToParse, "Resource");
	}
	
	@Test
	public void resourceManagerReference() {
		ignoreFormattingDifferences();
		testFile("resourceManagerReference.tjp");
	}
	
	@Test
	public void resourceTestAllAttributes() {
		String text = "resource res1 \"resource one\" { " +
				"booking test 2007-01-06-9:00 +9h " +
				"efficiency 10.3 " +
				"email \"someone@somewher.com\" " +
				"fail \"logical expression\" " +
				"flags f23, f24 " +
				"journalentry 2011-01-01 \"Happy birthday\" " +
				"limits { dailymax 2d } " +
				"managers res2,res3 " +
				"purge managers " +
				"rate 100.3 " +
				"resource res6 \"resource six\" " +
				"shifts shift2 2010-01-16 + 4 m " +
				"supplement resource res6 " +
				"vacation \"summer\" 2010-01-16 + 4 m " +
				"warn \"logical expression\" " +
				"workinghours mon-thu off " +
				"}";
		testParserRule(text, Resource.class.getSimpleName());
	}

}
