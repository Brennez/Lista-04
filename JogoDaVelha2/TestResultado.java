package JogoDaVelha2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestResultado {

	@Test
	public void testVencedorPrimeiraPosibilidadeOk() {
		//dado que..
		Tabuleiro.limparTabuleiro();
		Jogada.jogada("1", "X");
		Jogada.jogada("2", "X");
		Jogada.jogada("3", "X");
		
		//quando eu...
		Resultado.vencedor();
		
		//espero que..
		assertTrue(Resultado.getVencedor().equals("Jogador 1 venceu"));
	}
	
	@Test
	public void testVencedorSegundaPosibilidadeOk() {
		//dado que..
		Tabuleiro.limparTabuleiro();
		Jogada.jogada("4", "X");
		Jogada.jogada("5", "X");
		Jogada.jogada("6", "X");
		
		//quando eu...
		Resultado.vencedor();
		
		//espero que..
		assertTrue(Resultado.getVencedor().equals("Jogador 1 venceu"));
	}
	
	@Test
	public void testVencedorTerceiraPosibilidadeOk() {
		//dado que..
		Tabuleiro.limparTabuleiro();
		Jogada.jogada("7", "X");
		Jogada.jogada("8", "X");
		Jogada.jogada("9", "X");
		
		//quando eu...
		Resultado.vencedor();
		
		//espero que..
		assertTrue(Resultado.getVencedor().equals("Jogador 1 venceu"));
	}
	
	@Test
	public void testVencedorQuartaPosibilidadeOk() {
		//dado que..
		Tabuleiro.limparTabuleiro();
		Jogada.jogada("1", "X");
		Jogada.jogada("4", "X");
		Jogada.jogada("7", "X");
		
		//quando eu...
		Resultado.vencedor();
		
		//espero que..
		assertTrue(Resultado.getVencedor().equals("Jogador 1 venceu"));
	}
	
	@Test
	public void testVencedorQuintaPosiibilidadeOk() {
		//dado que..
		Tabuleiro.limparTabuleiro();
		Jogada.jogada("2", "X");
		Jogada.jogada("5", "X");
		Jogada.jogada("8", "X");
		
		//quando eu...
		Resultado.vencedor();
		
		//espero que..
		assertTrue(Resultado.getVencedor().equals("Jogador 1 venceu"));
	}
	
	@Test
	public void testVencedorSextaPosibilidadeOk() {
		//dado que..
		Tabuleiro.limparTabuleiro();
		Jogada.jogada("3", "X");
		Jogada.jogada("6", "X");
		Jogada.jogada("9", "X");
		
		//quando eu...
		Resultado.vencedor();
		
		//espero que..
		assertTrue(Resultado.getVencedor().equals("Jogador 1 venceu"));
	}
	
	@Test
	public void testVencedorPosibilidadeDiagonalPrincipalOk() {
		//dado que..
		Tabuleiro.limparTabuleiro();
		Jogada.jogada("1", "X");
		Jogada.jogada("5", "X");
		Jogada.jogada("9", "X");
		
		//quando eu...
		Resultado.vencedor();
		
		//espero que..
		assertTrue(Resultado.getVencedor().equals("Jogador 1 venceu"));
	}
	
	@Test
	public void testVencedorPosibilidadeDiagonalSecundariaOk() {
		//dado que..
		Tabuleiro.limparTabuleiro();
		Jogada.jogada("7", "X");
		Jogada.jogada("5", "X");
		Jogada.jogada("3", "X");
		
		//quando eu...
		Resultado.vencedor();
		
		//espero que..
		assertTrue(Resultado.getVencedor().equals("Jogador 1 venceu"));
	}
	
	@Test
	public void testeDeuVelha() {
		//dado que...
		Tabuleiro.limparTabuleiro();
		Jogada.jogada("1", "O");
		Jogada.jogada("2", "X");
		Jogada.jogada("3", "O");
		Jogada.jogada("4", "O");
		Jogada.jogada("5", "X");
		Jogada.jogada("6", "O");
		Jogada.jogada("7", "X");
		Jogada.jogada("8", "O");
		Jogada.jogada("9", "X");
		
		//quando eu...
		Partida.setJogadas(9);
		Resultado.vencedor();
		
		//espero que...
		assertEquals(Resultado.getVencedor(),"Deu velha");
	}
}
