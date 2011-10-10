package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ColumnsTest  extends XtextTest {
	
	
	@Test 
	public void testOneColumn() {
		testParserRule("columns alert width 10.1, daily celltext \"Daily\" \"if sponge\"", "Columns");
	}

}
