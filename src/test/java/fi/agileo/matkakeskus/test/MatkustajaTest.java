package fi.agileo.matkakeskus.test;

import static org.junit.Assert.*;
import fi.agileo.matkakeskus.domain.*;

import org.junit.Test;

public class MatkustajaTest {

	@Test
	public void testTilaaLippu() {
		Matkustaja m = new Matkustaja();
		Matkustaja o = new Matkustaja(true);
		Automaatti a = new Automaatti();
		
		m.TilaaLippu(a, 1, "Helsinki");
		assertEquals(1, m.getLiput().get(0).getTyyppi());
		assertEquals("100.0", String.valueOf(m.getLiput().get(0).getArvo()));
		assertEquals("Helsinki", m.getLiput().get(0).getMaaranpaa());
		
		o.TilaaLippu(a, 2, "Vaasa");
		assertEquals(2, o.getLiput().get(0).getTyyppi());
		assertEquals("49.5", String.valueOf(o.getLiput().get(0).getArvo()));
		assertEquals("Vaasa", o.getLiput().get(0).getMaaranpaa());
		
		o.TilaaLippu(a, -2, null);
		assertEquals(1, o.getLiput().get(1).getTyyppi());
		assertEquals("0.0", String.valueOf(o.getLiput().get(1).getArvo()));
		assertEquals("", o.getLiput().get(1).getMaaranpaa());
	}

}
