package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.ExtendTask;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class ExtendTest  extends XtextTest {
	
	public ExtendTest() {
		super("ExtendTest");
	}
	
	@Test 
	public void testExtendTaskText() {
		String text = "extend task { text T20 \"T20 Extend\" {inherit scenariospecific}}";
		testParserRule(text, ExtendTask.class.getSimpleName());
	}
	@Test 
	public void testExtendTaskText2() {
		String text = "extend task {text T20 \"T20 Extend\" {scenariospecific inherit}}";
		testParserRule(text, ExtendTask.class.getSimpleName());
	}
	@Test 
	public void testExtendTaskTextInheritOnly() {
		String text = "extend task {text T20 \"T20 Extend\" {inherit}}";
		testParserRule(text, ExtendTask.class.getSimpleName());
	}
	@Test 
	public void testExtendTaskTextNoAttributes() {
		String text = "extend task {text T20 \"T20 Extend\"}";
		testParserRule(text, ExtendTask.class.getSimpleName());
	}
	
	// links to extends resolve
	@Test 
	public void testSimple() {
		ignoreFormattingDifferences();
		testFile("simple.tjp");
	}

	// an 'extend resource' does not resolve link from a Task
	// an 'extend task' does not resolve a link from a Reource
	@Test 
	public void testSimpleCrossed() {
		ignoreFormattingDifferences();
		assertConstraints(testFileNoSerializer("simplecrossed.tjp")
				.nOfThemContain(2, "Couldn't resolve reference to Extend"));
	}


}
