package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class IncludeTest  extends XtextTest {
	
	
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
}
