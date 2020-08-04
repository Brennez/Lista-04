package Lista04;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Lista03.UsaEstoque;

public class TestUsaEstoque {

	@Test

	public void testUsaEstoqueDarBaixaEmCincoUnidadesEstoque1() {
		// Dado que...
		UsaEstoque ue = new UsaEstoque();
		// Quando eu...
		ue.estoque1.darBaixa(5);
		// Espero que...
		assertTrue(ue.estoque1.qtdAtual == 8);

	}

	@Test

	public void testReporSeteUnidadesEstoque2() {
		// Dado que...
		UsaEstoque ue = new UsaEstoque();
		// Quando eu...
		ue.estoque2.repor(7);
		// Espero que...
		assertTrue(ue.estoque2.qtdAtual == 18);

	}
	
	@Test
	public void testUsaEstoqueDarBaixaEstoque3() {
		//dado que...
		UsaEstoque ue = new UsaEstoque();
		//quando eu...
		ue.estoque3.darBaixa(4);
		//espero que...
		assertTrue(ue.estoque3.qtdAtual == 2);
	}
}