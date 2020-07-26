package JogoDaVelha2;

public class Ranking {
	
	private static int vencedor2 = 0;
	private static int velha = 0;
	private static int vencedor1 = 0;
	
	/*
	 * getters e setters dos atributos vencedor1, vencedor2 e velha
	 * Faz o incremento cada vez em que houver um vencedor na partida ou der velha
	 */
	public static int getVencedor1() {
		return vencedor1;
	}
	public static void setVencedor1() {
		Ranking.vencedor1++;
	}
	public static int getVencedor2() {
		return vencedor2;
	}
	public static void setVencedor2() {
		Ranking.vencedor2++;
	}
	public static int getVelha() {
		return velha;
	}
	public static void setVelha() {
		Ranking.velha++;
	}
	
	//Mostra o placar de quem ganhou em todas as partidas jogadas.
	static public void placar() {
		System.out.println("\n=== PLACAR ===");
		System.out.println("   X   --> " + Ranking.getVencedor1());
		System.out.println("   O   --> " + Ranking.getVencedor2());
		System.out.println(" Velha --> " + Ranking.getVelha());
	}
}
