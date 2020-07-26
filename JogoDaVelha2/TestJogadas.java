package JogoDaVelha2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestJogadas {
	@Test
	public void testJogadaComSimboloXNaPosicao1Ok() {
		// dado que...
		String posicao = "1";
		
		// quando eu...
		Jogada.jogada(posicao, "X");
		
		// espero que...
		assertTrue(Tabuleiro.getTabuleiro(0, 0) == "X");
	}

	@Test
	public void testJogadaComSimboloXNaPosicao2Ok() {
		// dado que...
		String posicao = "2";
		
		// quando eu...
		Jogada.jogada(posicao, "X");
		
		// espero que...
		assertTrue(Tabuleiro.getTabuleiro(0, 1) == "X");
	}

	@Test
	public void testJogadaComSimboloXNaPosicao3Ok() {
		// dado que...
		String posicao = "3";
		
		// quando eu...
		Jogada.jogada(posicao, "X");
		
		// espero que...
		assertTrue(Tabuleiro.getTabuleiro(0, 2) == "X");
	}

	@Test
	public void testJogadaComSimboloXNaPosicao4Ok() {
		// dado que...
		String posicao = "4";
		
		// quando eu...
		Jogada.jogada(posicao, "X");
		
		// espero que...
		assertTrue(Tabuleiro.getTabuleiro(1, 0) == "X");
	}

	@Test
	public void testJogadaComSimboloXNaPosicao5Ok() {
		// dado que...
		String posicao = "5";
		
		// quando eu...
		Jogada.jogada(posicao, "X");
		
		// espero que...
		assertTrue(Tabuleiro.getTabuleiro(1, 1) == "X");
	}

	@Test
	public void testJogadaComSimboloXNaPosicao6Ok() {
		// dado que...
		String posicao = "6";
		
		// quando eu...
		Jogada.jogada(posicao, "X");
		
		// espero que...
		assertTrue(Tabuleiro.getTabuleiro(1, 2) == "X");
	}

	@Test
	public void testJogadaComSimboloXNaPosicao7Ok() {
		// dado que...
		String posicao = "7";
		
		// quando eu...
		Jogada.jogada(posicao, "X");
		
		// espero que...
		assertTrue(Tabuleiro.getTabuleiro(2, 0) == "X");
	}

	@Test
	public void testJogadaComSimboloXNaPosicao8Ok() {
		// dado que...
		String posicao = "8";
		
		// quando eu...
		Jogada.jogada(posicao, "X");
		
		// espero que...
		assertTrue(Tabuleiro.getTabuleiro(2, 1) == "X");
	}

	@Test
	public void testJogadaComSimboloXNaPosicao9Ok() {
		// dado que...
		String posicao = "9";
		
		// quando eu...
		Jogada.jogada(posicao, "X");
		
		// espero que...
		assertTrue(Tabuleiro.getTabuleiro(2, 2) == "X");
	}

}
