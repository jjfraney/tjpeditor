package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.Allocate;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class AllocateTest  extends XtextTest {
	
	@Test
	public void testNormal() {
		String text = "allocate node01 { mandatory alternative node02, node03, node04, node05 }";
		testParserRule(text, Allocate.class.getSimpleName());
	}

}
