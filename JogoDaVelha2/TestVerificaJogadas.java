package JogoDaVelha2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestVerificaJogadas {

	@Test

	public void testEntradaValidaNaPosicao1Ok() {
		//dado que...
		String posicao = Partida.getPosicao();
		posicao = "1";
		
		// quando eu...
		boolean resultado = Jogada.verificaJogada(posicao);
		
		// espero que...
		assertTrue(resultado);
	}

	@Test

	public void testEntradaValidaNaPosicao2Ok() {
		// dado que eu...
		String posicao = Partida.getPosicao();
		posicao = "2";
		
		// quando eu...
		boolean resultado = Jogada.verificaJogada(posicao);
		
		// espero que...
		assertTrue(resultado);
	}

	@Test

	public void testEntradaValidaNaPosicao3Ok() {
		// dado que eu...
		String posicao = Partida.getPosicao();
		posicao = "3";
		
		// quando eu...
		boolean resultado = Jogada.verificaJogada(posicao);
		
		// espero que...
		assertTrue(resultado);
	}

	@Test

	public void testEntradaValidaNaPosicao4Ok() {
		// dado que eu...
		String posicao = Partida.getPosicao();
		posicao = "4";
		
		// quando eu...
		boolean resultado = Jogada.verificaJogada(posicao);
		
		// espero que...
		assertTrue(resultado);
	}

	@Test

	public void testEntradaValidaNaPosicao5Ok() {
		// dado que eu...
		String posicao = Partida.getPosicao();
		posicao = "5";
		
		// quando eu...
		boolean resultado = Jogada.verificaJogada(posicao);
		
		// espero que...
		assertTrue(resultado);
	}

	@Test

	public void testEntradaValidaNaPosicao6Ok() {
		// dado que eu...
		String posicao = Partida.getPosicao();
		posicao = "6";
		
		// quando eu...
		boolean resultado = Jogada.verificaJogada(posicao);
		
		// espero que...
		assertTrue(resultado);
	}

	@Test

	public void testEntradaValidaNaPosicao7Ok() {
		// dado que eu...
		String posicao = Partida.getPosicao();
		posicao = "7";
		
		// quando eu...
		boolean resultado = Jogada.verificaJogada(posicao);
		
		// espero que...
		assertTrue(resultado);
	}

	@Test

	public void testEntradaValidaNaPosicao8Ok() {
		// dado que eu...
		String posicao = Partida.getPosicao();
		posicao = "8";
		
		// quando eu...
		boolean resultado = Jogada.verificaJogada(posicao);
		
		// espero que...
		assertTrue(resultado);
	}

	@Test

	public void testEntradaValidaNaPosicao9Ok() {
		// dado que eu...
		String posicao = Partida.getPosicao();
		posicao = "9";
		
		// quando eu...
		boolean resultado = Jogada.verificaJogada(posicao);
		
		// espero que...
		assertTrue(resultado);
	}

	@Test

	public void testEntradaNaPosicaoInvalida() {
		// dado que...
		String posicao = Partida.getPosicao();
		posicao = "123";
		
		// quando eu...
		boolean resultado = Jogada.verificaJogada(posicao);
		
		// espero que...
		assertFalse(resultado);
	}

}
