package FolhaDePagamento;

public class Gerente extends Empregado {

	Gerente(String nome) {
		super.nome = nome;
		super.cargo = "Gerente";
		super.salarioBase = 4000;
	}

}
