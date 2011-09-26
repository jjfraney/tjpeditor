package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner.class)
public class RealFormatTest extends XtextTest {

	@Test
	public void testNumberFormat() {
		testParserRule("numberformat \"-\" \"\" \"\" \",\" 2", "NumberFormat");
	}
	
	@Test
	public void testCurrencyFormat() {
		testParserRule("currencyformat \"(\" \")\" \",\" \".\" 2", "CurrencyFormat");
	}
	
}
