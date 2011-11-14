package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.jjflyboy.tjpeditor.project.Export;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class ExportTest  extends XtextTest {
	
	
	@Test 
	public void testAllExports() {
		String text = "export \"test export\" " +
				"{ " +
				"definitions * " +
				"end 2011-07-07 " +
				"hideresource \"logical expression\" " +
				"hidetask \"logical expression\" " +
				"period 2010-01-16 + 4 m " +
				"resourceattributes * " +
				"rollupresource \"logical expression\" " +
				"rolluptask \"logical expression\" " +
				"scenarios sc1, sc2 " +
				"start 2011-07-07 " +
				"taskattributes - " +
				"timezone \"EST\" " +
				"}";
		testParserRule(text, Export.class.getSimpleName());
	}

}
