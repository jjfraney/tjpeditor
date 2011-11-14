package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.Alert;
import org.jjflyboy.tjpeditor.project.JournalEntry;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class JournalTest  extends XtextTest {
	
	@Test
	public void testAlert() {
		testParserRule("alert yellow", Alert.class.getSimpleName());
	}

	@Test 
	public void testSimple() {
		testParserRule("journalentry 2011-11-12 \"T2.1 Yellow\" ", JournalEntry.class.getSimpleName());
	}

	@Test 
	public void testWithAttributes() {
		testParserRule("journalentry 2011-11-12 \"T2.1 Yellow\" { summary \"yellow today\" alert yellow details \"some details\" }", JournalEntry.class.getSimpleName());
	}

}
