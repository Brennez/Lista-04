package JogoDaVelha2;

import java.util.Scanner;

public class Jogo {
	private Scanner ler = new Scanner(System.in);
	
	//chama uma partida de jogo da velha e mostra o menu de op��es
	public Jogo() {

		 int op = 0;
		
		Partida p = new Partida(); //instancia um objeto de partida.

		p.partida(); //Inicia uma partida.
		
		//Menu de op��es do usu�rio.
		do {
			
			System.out.println("\nMENU DE OP��ES\n");
			System.out.println("[1] - Jogar novamente");
			System.out.println("[2] - Sair do jogo");
			System.out.println("[3] - Mostrar placar");
			System.out.print("\nDigite sua op��o: ");
			op = ler.nextInt();
			switch (op) {
			case 1:
				Tabuleiro.limparTabuleiro();
				Resultado.setVencedor("\nSem vencedor, continue jogando");
				p.partida(); //caso o usu�rio digite 1, chama uma nova partida.
				break;
			case 2:
				System.err.println("Saindo...");
				break;
			case 3:
				Ranking.placar();
				break;
			default:
				System.err.println("Op��o inv�lida...");
				break;
			}
			
			
		} while (op != 2);

	}

	
}