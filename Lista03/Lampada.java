package Lista03;

public class Lampada {
	public boolean ligada;
	String observa;
	
	public void liga() {
		this.ligada = true;
	}
	
	public void desliga() {
		this.ligada = false;
	}
	
	public String observa() {
		if(ligada) {
			observa = "Ligada";
		}
		else {
			observa = "Desligada";
		}
		return observa;
	}

}
