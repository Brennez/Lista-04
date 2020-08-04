package ListaDeTarefas;

public class Main {

	public static void main(String[] args) {
		Tarefa t1 = new Tarefa("Assistir filmes", "28/07");
		Tarefa t2 = new Tarefa("Ir a escola", "29/07");
		Tarefa t3 = new Tarefa("Fazer compras", "29/07");
		Tarefa t4 = new Tarefa("Estudar para o teste", "30/07");
		
		ListaDeTarefas.adicionaTarefa(t1);
		ListaDeTarefas.adicionaTarefa(t2);
		ListaDeTarefas.adicionaTarefa(t3);
		ListaDeTarefas.adicionaTarefa(t4);
		
		ListaDeTarefas.alteraData(t1, "29/07");
		//ListaDeTarefas.consultaTarefa(t1);
		
		//ListaDeTarefas.imprimeLista();
		ListaDeTarefas.alteraDescricao(t1, "assistir documentários");
		//ListaDeTarefas.imprimeLista();
		
		ListaDeTarefas.removeTarefa(t4);
		//ListaDeTarefas.imprimeLista();
		
		ListaDeTarefas.alteraStatus(t1);
		ListaDeTarefas.imprimeLista();
		
	
		
		

	}

}
