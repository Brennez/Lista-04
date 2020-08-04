package Lista04;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Lista03.ContaBancaria;

public class TestContaBancaria {

	@Test
	public void testDepositaContaBanariaOk() {
		// dado que...
		ContaBancaria c = new ContaBancaria();
		// quando eu...
		c.deposita(600);
		// espero que...
		assertTrue(c.saldo == 600);
	}

	@Test
	public void testSacaContaBancariaOk() {
		// dado que...
		ContaBancaria c = new ContaBancaria();
		// quando eu...
		c.deposita(600);
		c.saca(400);
		// espero que...
		assertTrue(c.saldo == 200);
	}

	@Test

	public void testCalculaRendimentoContaBancariaOk() {
		// dado que...
		ContaBancaria c = new ContaBancaria();
		// quando eu...
		c.deposita(200);
		c.calculaRendimento();
		// espero que...
		assertTrue(c.calculaRendimento() == 20);
	}
}
