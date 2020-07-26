package JogoDaVelha2;

public class Jogada {

	//Verifica a posição do tabuleiro e testa, para saber se já existe algum símbolo na posição desejada pelo usuário.
	public static boolean verificaJogada(String posicao) {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (Tabuleiro.getTabuleiro(linha, coluna).equals(posicao)) {
					return true;
				}
			}
		}
		return false;
	}

	//Executa a jogada na posição em que o usuário desejar, passando como parâmetro a posição desejada e o sìmbolo do jogador. 
	public static void jogada(String posicao, String simbolo) {
		if (verificaJogada(posicao)) {

			switch (posicao) {
			case "1":
				Tabuleiro.setTabuleiro(0, 0, simbolo);
				Resultado.vencedor();
				break;
			case "2":
				Tabuleiro.setTabuleiro(0, 1, simbolo);
				Resultado.vencedor();
				break;
			case "3":
				Tabuleiro.setTabuleiro(0, 2, simbolo);
				Resultado.vencedor();
				break;
			case "4":
				Tabuleiro.setTabuleiro(1, 0, simbolo);
				Resultado.vencedor();
				break;
			case "5":
				Tabuleiro.setTabuleiro(1, 1, simbolo);
				Resultado.vencedor();
				break;
			case "6":
				Tabuleiro.setTabuleiro(1, 2, simbolo);
				Resultado.vencedor();
				break;
			case "7":
				Tabuleiro.setTabuleiro(2, 0, simbolo);
				Resultado.vencedor();
				break;
			case "8":
				Tabuleiro.setTabuleiro(2, 1, simbolo);
				Resultado.vencedor();
				break;
			case "9":
				Tabuleiro.setTabuleiro(2, 2, simbolo);
				Resultado.vencedor();
				break;
			default:
				System.out.println("Jogada Inválida!, tente novamente ");
				break;
			}
		}
	}

}
