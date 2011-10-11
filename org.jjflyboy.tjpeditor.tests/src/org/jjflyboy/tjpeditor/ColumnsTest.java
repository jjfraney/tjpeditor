package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class ColumnsTest  extends XtextTest {
	
	
	@Test 
	public void testOneColumn() {
		testParserRule("columns alert width 10.1, daily celltext \"Daily\" \"if sponge\"", "Columns");
	}

}
