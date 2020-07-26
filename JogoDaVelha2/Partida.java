package JogoDaVelha2;

import java.util.Scanner;

public class Partida {

	private Scanner ler = new Scanner(System.in);
	private static String posicao;  //variável em que definirá a posição do tabuleiro em que irá ser jogado
	
	

	private static int jogadas = 0;  //atributo de contador de jogadas válidas.

	
	//Inicia a partida.
	public void partida() {

		while (true) {

			do { // inicio da jogada jogador 1.
				Tabuleiro.mostrar(); 
				System.out.print("(Jogador 1) Digite sua jogada: "); 
				posicao = ler.nextLine();
				
				//Laço para repetir a mesma jogada até que o usuário digite uma jogada válida.
				while (!Jogada.verificaJogada(posicao)) {
					Tabuleiro.mostrar();
					System.err.println("\nJogada inválida, tente novamente\n\n");
					System.out.print("(Jogador 1) Digite sua jogada: ");
					posicao = ler.nextLine();
				}

				jogadas = getJogadas() + 1; //Faz o incremento no contador de jogadas.
				Jogada.jogada(posicao, "X"); //Chama o método que executa a jogada do jogador 1.

			} while (false); // fim da jogada do jogador 1.
			
			//Teste para saber se existe um vencedor. Se houver irá sair do laço while(True).
			if (!Resultado.getVencedor().equals("\nSem vencedor, continue jogando")) {
				break;
			}

			do { // inicio da jogada do jogador 2
				Tabuleiro.mostrar();
				System.out.print("(Jogador 2) Digite sua jogada: ");
				posicao = ler.nextLine();
				
				//Laço para repetir a mesma jogada até que o usuário digite uma jogada válida.
				while (!Jogada.verificaJogada(posicao)) {
					Tabuleiro.mostrar();
					System.err.println("\nJogada inválida, tente novamente\n\n");
					System.out.print("(Jogador 2) Digite sua jogada: ");
					posicao = ler.nextLine();
				}

				jogadas = getJogadas() + 1;  //Faz o incremento no contador dr jogadas.
				Jogada.jogada(posicao, "O"); //Chama o método que executa a jogada do jogador 2.

			} while (false); // fim da jogada do jogador 2
			
			//Teste para saber se existe um vencedor. Se houver irá sair do laço while(True).
			if (!Resultado.getVencedor().equals("\nSem vencedor, continue jogando")) {
				break;
			}

		}
	}
	
	//getters e setters do atributo jogadas e posição.
	public static int getJogadas() {
		return jogadas;
	}
	
	public static void setJogadas(int jogadas) {
		Partida.jogadas = jogadas;
	}
	
	public static String getPosicao() {
		return posicao;
	}

	public static void setPosicao(String posicao) {
		Partida.posicao = posicao;
	}

}
