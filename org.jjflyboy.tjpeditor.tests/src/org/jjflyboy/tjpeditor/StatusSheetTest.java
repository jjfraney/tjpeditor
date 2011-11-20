package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.StatusSheet;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class StatusSheetTest  extends XtextTest {
	
	@Test
	public void testAllAttributes() {
		String text = "statussheet top 2009-12-04 { } ";
		testParserRule(text, StatusSheet.class.getSimpleName());
	}

}
