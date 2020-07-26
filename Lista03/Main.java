package Lista03;

public class Main {

	public static void main(String[] args) {
		
		//quest01e02();
		//quest03e04();
		//quest05e06e07();
		//quest08e09();
		

	}
	
	public static void quest01e02() {
		
		Lampada lampa1 = new Lampada();
		Lampada lampa2 = new Lampada();
		
		lampa1.liga();
		lampa2.desliga();
		System.out.println("Lampada 1: " + lampa1.observa());
		System.out.println("Lampada2: " + lampa2.observa());
	}
	
	public static void quest03e04() {
		
		UsaQuadrado q = new UsaQuadrado();
		
		System.out.println("Quadrado 1 --> área: " + q.q1.area() + "  Perímetro: " + q.q1.perimetro());
		System.out.println("Quadrado 2 --> área: " + q.q2.area() + " Perímetro: " + q.q2.perimetro());
		System.out.println("Quadrado 3 --> área: " + q.q3.area() + " Perímetro: " + q.q3.perimetro());
		
		
	}
	
	public static void quest05e06e07() {
		UsaEstoque ue = new UsaEstoque();
		
		ue.estoque1.darBaixa(5);
		ue.estoque2.repor(7);
		ue.estoque3.darBaixa(4);
		
		System.out.println("[Estoque 1] " + ue.estoque1.mostra());
		System.out.println("[Estoque 2] " + ue.estoque2.mostra());
		System.out.println("[Estoque 3] " + ue.estoque3.mostra() + "\n");
		
		
	}
	
	public static void quest08e09() {
		ContaBancaria c = new ContaBancaria("Brenne", 40028922, "Caixa", "12/11/2020");
		c.deposita(500);
		System.out.println(c.recuperaDadosDeImpressao());
			
	}
	
	

}
