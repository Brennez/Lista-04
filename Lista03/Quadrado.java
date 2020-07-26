package Lista03;

public class Quadrado {
	double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double area() {
		return lado * lado;
	}
	
	public double perimetro() {
		return 4 * lado;
	}
}
