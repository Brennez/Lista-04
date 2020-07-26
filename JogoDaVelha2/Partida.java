package JogoDaVelha2;

import java.util.Scanner;

public class Partida {

	private Scanner ler = new Scanner(System.in);
	private static String posicao;  //vari�vel em que definir� a posi��o do tabuleiro em que ir� ser jogado
	
	

	private static int jogadas = 0;  //atributo de contador de jogadas v�lidas.

	
	//Inicia a partida.
	public void partida() {

		while (true) {

			do { // inicio da jogada jogador 1.
				Tabuleiro.mostrar(); 
				System.out.print("(Jogador 1) Digite sua jogada: "); 
				posicao = ler.nextLine();
				
				//La�o para repetir a mesma jogada at� que o usu�rio digite uma jogada v�lida.
				while (!Jogada.verificaJogada(posicao)) {
					Tabuleiro.mostrar();
					System.err.println("\nJogada inv�lida, tente novamente\n\n");
					System.out.print("(Jogador 1) Digite sua jogada: ");
					posicao = ler.nextLine();
				}

				jogadas = getJogadas() + 1; //Faz o incremento no contador de jogadas.
				Jogada.jogada(posicao, "X"); //Chama o m�todo que executa a jogada do jogador 1.

			} while (false); // fim da jogada do jogador 1.
			
			//Teste para saber se existe um vencedor. Se houver ir� sair do la�o while(True).
			if (!Resultado.getVencedor().equals("\nSem vencedor, continue jogando")) {
				break;
			}

			do { // inicio da jogada do jogador 2
				Tabuleiro.mostrar();
				System.out.print("(Jogador 2) Digite sua jogada: ");
				posicao = ler.nextLine();
				
				//La�o para repetir a mesma jogada at� que o usu�rio digite uma jogada v�lida.
				while (!Jogada.verificaJogada(posicao)) {
					Tabuleiro.mostrar();
					System.err.println("\nJogada inv�lida, tente novamente\n\n");
					System.out.print("(Jogador 2) Digite sua jogada: ");
					posicao = ler.nextLine();
				}

				jogadas = getJogadas() + 1;  //Faz o incremento no contador dr jogadas.
				Jogada.jogada(posicao, "O"); //Chama o m�todo que executa a jogada do jogador 2.

			} while (false); // fim da jogada do jogador 2
			
			//Teste para saber se existe um vencedor. Se houver ir� sair do la�o while(True).
			if (!Resultado.getVencedor().equals("\nSem vencedor, continue jogando")) {
				break;
			}

		}
	}
	
	//getters e setters do atributo jogadas e posi��o.
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
