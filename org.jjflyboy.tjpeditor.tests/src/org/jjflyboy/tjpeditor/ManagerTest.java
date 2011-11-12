package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class ManagerTest  extends XtextTest {
	
	
	@Test 
	public void testSomeManagers() {
		testParserRule("managers res1, res2", "Managers");
	}
	
	@Test 
	public void testNoManagers() {
		testParserRuleErrors("managers", "Managers");
	}
	


}
