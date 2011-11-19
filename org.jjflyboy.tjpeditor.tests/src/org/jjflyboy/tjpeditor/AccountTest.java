package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class AccountTest  extends XtextTest {
	
	
	@Test 
	public void test() {
		testParserRule("account \"test account\"", "Account");
	}
	@Test 
	public void testSupplement() {
		testParserRule("supplement account ac1 {}", "SupplementAccount");
	}

	@Test 
	public void testWithId() {
		testParserRule("account acso \"test account\"", "Account");
	}
	
	
	@Test 
	public void testEmptyAttributes() {
		testParserRule("account \"test account\" { } ", "Account");
	}
	
	@Test
	public void testWithSubAccount() {
		testParserRule("account \"Test account\" { account \"sub account\" }", "Account");
	}
	
	@Test 
	public void testWithCredit() {
		testParserRule("account \"test account\" { credit 2011-12-11 \"extra credit\" 4.30 } ", "Account");
	}
	
	@Test 
	public void testWithFlags() {
		testParserRule("account \"test account\" { credit 2011-12-11 \"extra credit\" 4.30 flags flg1, flg2, flg3} ", "Account");
	}
	


}
