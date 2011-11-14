package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
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

}
