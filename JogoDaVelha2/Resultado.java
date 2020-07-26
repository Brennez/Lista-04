package JogoDaVelha2;

public class Resultado {

	private static String vencedor = "\nSem vencedor, continue jogando";
	
	//getter e setters do atributo vencedor.
	public static String getVencedor() {
		return vencedor;
	}

	public static void setVencedor(String vencedor) {
		Resultado.vencedor = vencedor;
	}
	
	
	/*
	 * O m�tododo vencedor() percorre um vetor (teste) que cont�m todas as combina��es com as possibilidades de vit�rias.
	 * Se houver uma sequ�ncia de 3 s�mbolos iguais, o m�todo atribui um vencedor a vari�vel vencedor.
	 */
	
	static public String vencedor() {
		String[] teste = new String[8];
	
		// Teste para saber se ao fim das 9 jogadas n�o tiver um vencedor, ele atribui a String "Deu velha" ao atributo vencedor.
		if (Partida.getJogadas() == 9) {
			vencedor = "Deu velha";
			Ranking.setVelha();
			Partida.setJogadas(0);
		}

		teste[0] = Tabuleiro.getTabuleiro(0, 0) + Tabuleiro.getTabuleiro(0, 1) + Tabuleiro.getTabuleiro(0, 2);
		teste[1] = Tabuleiro.getTabuleiro(1, 0) + Tabuleiro.getTabuleiro(1, 1) + Tabuleiro.getTabuleiro(1, 2);
		teste[2] = Tabuleiro.getTabuleiro(2, 0) + Tabuleiro.getTabuleiro(2, 1) + Tabuleiro.getTabuleiro(2, 2);

		teste[3] = Tabuleiro.getTabuleiro(0, 0) + Tabuleiro.getTabuleiro(1, 0) + Tabuleiro.getTabuleiro(2, 0);
		teste[4] = Tabuleiro.getTabuleiro(0, 1) + Tabuleiro.getTabuleiro(1, 1) + Tabuleiro.getTabuleiro(2, 1);
		teste[5] = Tabuleiro.getTabuleiro(0, 2) + Tabuleiro.getTabuleiro(1, 2) + Tabuleiro.getTabuleiro(2, 2);

		teste[6] = Tabuleiro.getTabuleiro(0, 0) + Tabuleiro.getTabuleiro(1, 1) + Tabuleiro.getTabuleiro(2, 2);
		teste[7] = Tabuleiro.getTabuleiro(2, 0) + Tabuleiro.getTabuleiro(1, 1) + Tabuleiro.getTabuleiro(0, 2);

		//La�o para percorrer o vetor (teste) e procurar pela sequ�ncia de 3 s�mbolos que determina a ocorr�ncia de um vencedor.
		for (int i = 0; i < teste.length; i++) {
			if (teste[i].equals("XXX")) {
				vencedor = "Jogador 1 venceu";
				Partida.setJogadas(0);
				Ranking.setVencedor1();

			}

			else if (teste[i].equals("OOO")) {
				vencedor = "Jogador 2 venceu";
				Partida.setJogadas(0);
				Ranking.setVencedor2();
				
			}

		}

		System.out.println(vencedor);
		return vencedor;

	}

}
