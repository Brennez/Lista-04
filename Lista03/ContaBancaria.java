package Lista03;

public class ContaBancaria {

	String nome, agencia, dataDeAbertura;
	int numero;
	public double saldo;

	public ContaBancaria(String nome, int numero, String agencia, String dataDeAbertura) {
		this.nome = nome;
		this.agencia = agencia;
		this.dataDeAbertura = dataDeAbertura;
		this.numero = numero;
	}
	
	public ContaBancaria() {
		
	}

	public void saca(int valor) {
		if (this.saldo <= 0) {
			System.out.println("Erro! você não possui saldo suficiente");
		} else {
			this.saldo = this.saldo - valor;
		}

	}

	public void deposita(int valor) {

		this.saldo = this.saldo + valor;

	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public String recuperaDadosDeImpressao() {
		
		StringBuilder status = new StringBuilder();
		status.append("Nome: " + this.nome + "\n");
		status.append("Número: " + this.numero + "\n");
		status.append("Agência: " + this.agencia + "\n");
		status.append("Data de Abertura: " + this.dataDeAbertura + "\n");
		status.append("Saldo: " + this.saldo + "\n");

		return status.toString();
	}

}
