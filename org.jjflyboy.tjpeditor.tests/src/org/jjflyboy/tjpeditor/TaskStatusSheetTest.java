package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.TaskStatusSheet;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class TaskStatusSheetTest  extends XtextTest {
	
	@Test
	public void testReferenceById() {
		String text = "task t1 { } ";
		testParserRule(text, TaskStatusSheet.class.getSimpleName());
	}
	
	@Test
	public void testReferenceByAbsoluteId() {
		String text = "task top.t5.t1 { }";
		testParserRule(text, TaskStatusSheet.class.getSimpleName());
	}
	
	@Test
	public void testAllAttributes() {
		String text = "task t1 { " +
				"task t4 {}" +
				"status red \"status text\" {} " +
				"}";
		testParserRule(text, TaskStatusSheet.class.getSimpleName());
	}

}
