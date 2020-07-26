package Lista03;

public class Estoque {
	public String nome;
	public int qtdAtual, qtdMinima;
	
	public Estoque() {
		
	}
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		if(this.qtdAtual < 0 || this.qtdMinima < 0) {
			System.out.println("Erro! QtdMinima não pode ser negativa");
		}
		else {
			this.qtdAtual = qtdAtual;
			this.qtdMinima = qtdMinima;
			this.nome = nome;
		}
		
			
		
	}
	
	public void mudarNome(String nome) {
		
	}
	
	public void mudarQtdMinima(int qtdMinima) {
		if(this.qtdAtual < 0) {
			System.out.println("Erro! QtdMinima não pode ser negativa");
		}
		
	}
	
	public void repor(int qtd) {
		this.qtdAtual = this.qtdAtual + qtd;
	}
	
	public void darBaixa(int qtd) {
		this.qtdAtual = this.qtdAtual - qtd;
	}
	
	public String mostra() {
		
		StringBuilder status = new StringBuilder();
		status.append("\nNome: " + this.nome);
		status.append("\nQuantidade Mínima: "+ this.qtdAtual);
		status.append("\nQuantidade atual: " + this.qtdMinima + "\n");
		
		return status.toString();
	}
	
	public boolean precisaRepor() {
		if (this.qtdAtual <= this.qtdMinima) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
