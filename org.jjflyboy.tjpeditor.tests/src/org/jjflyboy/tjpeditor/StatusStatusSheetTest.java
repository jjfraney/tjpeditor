package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.StatusStatusSheet;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class StatusStatusSheetTest  extends XtextTest {
	
	@Test
	public void testAllAttributes() {
		String text = "status red \"status text\" { " +
				"author fred " +
				"details \"details string\" " +
				"flags f2, f3 " +
				"summary \"summary text\" " +
				"}";
		testParserRule(text, StatusStatusSheet.class.getSimpleName());
	}

}
