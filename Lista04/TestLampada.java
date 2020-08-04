package Lista04;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Lista03.Lampada;

public class TestLampada {
	
	@Test
	public void testLampadaLigada() {
		//dado que...
		Lampada l = new Lampada();
		//quando eu..
		l.liga();
		//espero que...
		assertTrue(l.ligada);
	}
	
	@Test
	public void testLampadaDesligada() {
		//dado que...
		Lampada l = new Lampada();
		//quando eu...
		l.desliga();
		//espero que...
		assertFalse(l.ligada);
	}
	


}
