package org.jjflyboy.tjpeditor;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ProjectInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class IsodateTest extends XtextTest {

	@Test
	public void testIsodate() {
		testTerminal("2010-01-16", "ISODATE");
	}
	@Test
	public void testIsodateMinutes() {
		testTerminal("2010-01-16-12:20", "ISODATE");
	}
	@Test
	public void testIsoDateMinutesSeconds() {
		testTerminal("2010-01-16-12:20:30", "ISODATE");
	}
	@Test
	public void testIsoDateMinutesTimeZone() {
		testTerminal("2010-01-16-12:20-0100", "ISODATE");
	}
	@Test
	public void testIsoDateMinutesIllicitTimeZone() {
		testNotTerminal("2010-01-16-12:20-010", "ISODATE");
	}

}
