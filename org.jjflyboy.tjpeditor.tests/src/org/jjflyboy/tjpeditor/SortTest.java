package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.Criterion;
import org.jjflyboy.tjpeditor.project.SortAccounts;
import org.jjflyboy.tjpeditor.project.SortJournalEntries;
import org.jjflyboy.tjpeditor.project.SortResources;
import org.jjflyboy.tjpeditor.project.SortTasks;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class SortTest extends XtextTest {

	@Test
	public void testWithTree() {
		testParserRule("sortaccounts tree", SortAccounts.class.getSimpleName());
	}
	@Test
	public void testWithCriteria() {
		testParserRule("sorttasks daily.down", SortTasks.class.getSimpleName());
	}
	@Test
	public void testWithTreeAndCriterion() {
		testParserRule("sortjournalentries tree, duties.up", SortJournalEntries.class.getSimpleName());
	}
	@Test
	public void testWithTreeAndCriteria() {
		testParserRule("sortresources tree, rate.down, note.up,  priority.down, quarterly.up", SortResources.class.getSimpleName());
	}


	@Test
	public void testCriterionUp() {
		testParserRule("alert.up", Criterion.class.getSimpleName());
	}
	@Test
	public void testCriterionDown() {
		testParserRule("alert.down", Criterion.class.getSimpleName());
	}

}
