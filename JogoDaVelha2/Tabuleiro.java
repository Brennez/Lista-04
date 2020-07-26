package JogoDaVelha2;

public class Tabuleiro {
	
	//Criando a matriz de tabuleiro
	private static String[][] tabuleiro = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	
	//getters e setters da matriz de tabuleiro.
	public static String getTabuleiro(int linha, int coluna) {
		return tabuleiro[linha][coluna];
	}

	public static void setTabuleiro(int linha, int coluna, String simbolo) {
		Tabuleiro.tabuleiro[linha][coluna] = simbolo;
	}

	
	// O método percorre a matriz e imprime a matriz de tabuleiro na tela.
	static public boolean mostrar() {
		
		 System.out.println("JOGO DA VELHA");
		
		for(int linha = 0; linha < 3; linha++ ) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("|" + tabuleiro[linha][coluna] + "|");
			}
			System.out.println("");
		}
		System.out.println();
		return true;
	}
	
	//O método limpa o tabuleiro, para que possa ser executada outra partida.
	static public boolean limparTabuleiro() {
		int aux = 1;
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				tabuleiro[linha][coluna] = String.valueOf(aux);
				aux++;
			}
			Partida.setJogadas(0);
		}
		return true;
	}

}
