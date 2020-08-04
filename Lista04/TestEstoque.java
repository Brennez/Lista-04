package Lista04;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Lista03.Estoque;

public class TestEstoque {

	@Test
	public void testReporComEntradaqtdAtualOk() {
		// dado que...
		Estoque e = new Estoque();
		// quando eu...
		e.qtdAtual = 10;
		e.repor(10);
		// espero que...
		assertTrue(e.qtdAtual == 20);
	}

	@Test
	public void testDarBaixaComEntradaqtdAtualOk() {
		// dado que...
		Estoque e = new Estoque();
		// quando eu...
		e.qtdAtual = 10;
		e.darBaixa(5);
		// espero que..
		assertTrue(e.qtdAtual == 5);
	}

	@Test
	public void testPrecisaReportrue() {
		// dado que...
		Estoque e = new Estoque();
		// quando eu
		e.precisaRepor();
		// espero que..
		assertTrue(e.precisaRepor() == true);
	}

	@Test
	public void testPrecisaReporfalse() {
		// dado que...
		Estoque e = new Estoque();
		// quando eu
		e.precisaRepor();
		// espero que..
		assertFalse(e.precisaRepor() == false);
	}

}
