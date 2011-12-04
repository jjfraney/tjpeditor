package org.jjflyboy.tjpeditor;

import static org.junit.Assert.assertEquals;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipselabs.xtext.utils.unittesting.FluentIssueCollection;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.Global;
import org.jjflyboy.tjpeditor.project.Managers;
import org.jjflyboy.tjpeditor.project.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class IncludeTest  extends XtextTest {
	
	@Inject
	ParseHelper<Global> parser;

	public IncludeTest() {
		super("IncludeTest");
	}

	@Test 
	public void test() {
		testParserRule("include \"file.tji\"", "IncludeProperties");
	}
	
	@Test
	public void testDetectsBadFilename() {
		ignoreFormattingDifferences();
		testFile("badFilenameExtention.tjp");
		assertConstraints(
				  issues.errorsOnly()
				        .inLine(2)
				        .oneOfThemContains("include files only with '*.tji'")
				);

	}
	@Test
	public void testDetectsGoodFilename() {
		ignoreFormattingDifferences();
		testFile("goodFilenameExtention.tjp");
	}
	
	@Test
	public void canResolveIncludedGlobalTaskReference() {
		ignoreFormattingDifferences();
		ignoreSerializationDifferences();
		testFile("taskIncludedReference.tjp", "taskDefinition.tji");
		assertConstraints(
				  issues.errorsOnly()
				        .inLine(28)
				        .oneOfThemContains("Couldn't resolve reference to Task 'deep'")
				);
	}
	@Test
	public void cannotResolveNotIncludedGlobalTaskReference() {
		ignoreFormattingDifferences();
		testFile("taskNotIncludedReference.tjp", "taskDefinition.tji");
		assertConstraints(
				  issues.errorsOnly()
				        .inLine(5)
				        .oneOfThemContains("Couldn't resolve reference to Task 'that'")
				);
		assertConstraints(
				  issues.errorsOnly()
				        .inLine(10)
				        .oneOfThemContains("Couldn't resolve reference to Task 'that.deep'")
				);
		assertConstraints(
				  issues.errorsOnly()
				        .inLine(15)
				        .oneOfThemContains("Couldn't resolve reference to Task '!that.deep'")
				);
		assertConstraints(
				  issues.errorsOnly()
				        .inLine(19)
				        .oneOfThemContains("Couldn't resolve reference to Task '!!that.deep'")
				);
	}
	
	@Test
	public void canResolveIncludedGlobalResourceReference() {
		ignoreFormattingDifferences();
		 testFile("resourceIncludedReference.tjp");
	}
	
	@Test
	public void cannotResolveNotIncludedGlobalResourceReference() {
		ignoreFormattingDifferences();
		testFile("resourceNotIncludedReference.tjp");
		assertConstraints(
				  issues.errorsOnly()
				        .inLine(14)
				        .oneOfThemContains("Couldn't resolve reference to Resource 'director2'")
				);
	}
	
	@Test
	public void cannotResolveForwardIncludedGlobalResourceReference() {
		ignoreFormattingDifferences();
		testFile("resourceForwardIncludedReference.tjp");
		assertConstraints(
				  issues.errorsOnly()
				        .inLine(9)
				        .oneOfThemContains("Couldn't resolve reference to Resource 'director2'")
				);
	}
	
	// to assert the scope picks the last defintion of a resource
	@Test
	public void canResolveDoubleIncludedGlobalResourceReference() {
		ignoreFormattingDifferences();
		FluentIssueCollection fic = testFile("resourceDoubleIncludedReference.tjp", "referenceDefinition.tji", "referenceDoubledDefinition.tji");
		Global global = (Global)(fic.getResource().getContents().get(0));
		
		Resource employee1 = (Resource)((global.getProperties().get(1)));
		String managerName = getManagerName(employee1);
		assertEquals("Director2", managerName);
		
		Resource employee2 = (Resource)(global.getProperties().get(3));
		managerName = getManagerName(employee2);
		assertEquals("redefined director2", managerName);
	}

	private String getManagerName(Resource employee1) {
		Managers managers = (Managers)(employee1.getAttributes().get(0));
		Resource director2 = (Resource)(managers.getResources().get(0));
		String managerName = director2.getName();
		return managerName;
	}


}
