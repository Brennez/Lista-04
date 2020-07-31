package FolhaDePagamento;



public class Main {

	public static void main(String[] args) {
		
		ListaDeFuncionario.cadastraEmpregado("Clóvis", "Funcionário");
		ListaDeFuncionario.cadastraEmpregado("Roberval", "Gerente");
		ListaDeFuncionario.cadastraEmpregado("Bartolomeu", "Funcionário");
		ListaDeFuncionario.cadastraEmpregado("Clayton", "Gerente");
//		IU.IUdeFuncionario();
		ListaDeGratificacoes.adicionaGratificacao(0, "25/04");
		ListaDeGratificacoes.adicionaGratificacao(0, "26/04", 1);
		ListaDeGratificacoes.adicionaGratificacao(1, "27/04", 0);
		
//		
//		System.out.println("\n\nFuncionario Clóvis: \n" + ListaDeGratificacoes.recuperaGratificacao(0, 0));
//		
//		System.out.println("\n\nFuncionario Clóvis: \n" + ListaDeGratificacoes.recuperaGratificacao(0, 1));
//		
//		System.out.println("\n\nFuncionario Roberval: \n" + ListaDeGratificacoes.recuperaGratificacao(1, 0));
		ListaDeGratificacoes.mostraLista(0);
		
		
		
	

		


		
		
		
		//ListaDeFuncionario.atualizaEmpregado(3, "Clayton da silva");
		//ListaDeFuncionario.removeEmpregado(2);
		
		//ListaDeFuncionario.recuperaListaDeEmpregados();
		
		
		

	}

	

}
