package fi.agileo.matkakeskus.test;

import static org.junit.Assert.*;
import fi.agileo.matkakeskus.domain.*;

import org.junit.Test;

public class AutomaattiTest {

	@Test
	public void testLaskeEtaisyys() {
		Automaatti a = new Automaatti();
		assertEquals(300, a.LaskeEtaisyys("Helsinki"));
		assertEquals(400, a.LaskeEtaisyys("Turku"));
		assertEquals(125, a.LaskeEtaisyys("Tampere"));
		assertEquals(32, a.LaskeEtaisyys("Petäjävesi"));
		assertEquals(300, a.LaskeEtaisyys("Vaasa"));
		assertEquals(0, a.LaskeEtaisyys("tuntematonPaikkakunta"));
		assertEquals(0, a.LaskeEtaisyys(null));
	}
	
	@Test
	public void testLaskeArvo() {
		Automaatti a = new Automaatti();
		assertEquals("10.0", String.valueOf(a.LaskeArvo(1, "Petäjävesi", false)));
		assertEquals("20.295", String.valueOf(a.LaskeArvo(2, "Tampere", true)));
		assertEquals("0.0", String.valueOf(a.LaskeArvo(-1, null, false)));
	}
	
	@Test
	public void testTulostaLippu() {
		Automaatti a = new Automaatti();
		Lippu l1, l2, l3;
		
		l1 = a.TulostaLippu(1, "Tampere", false);
		assertEquals(1, l1.getTyyppi());
		assertEquals("Tampere", l1.getMaaranpaa());
		assertEquals("41.0", String.valueOf(l1.getArvo()));
		
		l2 = a.TulostaLippu(666, null, true);
		assertEquals(1, l2.getTyyppi());
		assertEquals("", l2.getMaaranpaa());
		assertEquals("0.0", String.valueOf(l2.getArvo()));
	}

}
