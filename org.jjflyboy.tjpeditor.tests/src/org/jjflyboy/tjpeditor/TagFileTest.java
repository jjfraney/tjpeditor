package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class TagFileTest  extends XtextTest {
	
	
	@Test 
	public void test() {
		testParserRule("tagfile \"file.txt\"", "TagFile");
	}
	
	@Test 
	public void testHideResource() {
		testParserRule("tagfile \"file.txt\" { hideresource \"logical expression\" }", "TagFile");
	}

}
