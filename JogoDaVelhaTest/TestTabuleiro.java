package JogoDaVelhaTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import JogoDaVelha2.Tabuleiro;

public class TestTabuleiro {
	@Test
	public void testTabuleiroOk() {
		// quando eu...
		boolean resultado = Tabuleiro.mostrar();
		// espero que...
		assertTrue(resultado);
	}
	
	@Test
	public void testLimpaTabuleiro() {
		//quando eu...
		boolean resultado = Tabuleiro.limparTabuleiro();
		
		//espero que...
		assertTrue(resultado);
		
	}
}

