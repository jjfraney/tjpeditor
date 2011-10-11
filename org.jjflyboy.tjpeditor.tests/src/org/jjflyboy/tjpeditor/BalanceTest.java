package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class BalanceTest  extends XtextTest {
	public BalanceTest() {
		super("BalanceTest");
	}
	
	@Test 
	public void testSimple() {
				
		testFile("simple.tjp");
	}
	

}
