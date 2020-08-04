package ListaDeTarefas;

import java.util.ArrayList;

public class ListaDeTarefas {

	protected static ArrayList<Tarefa> listaDeTarefa;					// Cria o Arraylist de tarefa;

	public static ArrayList<Tarefa> getListaDeTarefa() {
		return listaDeTarefa;
	}

	static public void adicionaTarefa(Tarefa digite_sua_tarefa) {     	//Método que adiciona uma tarefa ao array list de tarefa;

		if (listaDeTarefa == null) {									//Condicional para testar se a o array list está vazio, se tiver cria um objeto de tarefa;
			
		
			listaDeTarefa = new ArrayList<Tarefa>();
		}
		listaDeTarefa.add(digite_sua_tarefa);
	}

	static public boolean removeTarefa(Tarefa tarefa) {					//Método que remove uma tarefa do arraylist de Tarefa;
		return listaDeTarefa.remove(tarefa);
	}

	static public boolean alteraDescricao(Tarefa tarefa, String nova_descricao) {  //Método que altera a descrião de uma tarefa adicionada;

		for (Tarefa tarefas : listaDeTarefa) {
			if (tarefas.equals(tarefa)) {
				tarefas.setDescricao(nova_descricao);
				return true;
			}
		}
		return false;

	}

	static public boolean alteraData(Tarefa tarefa, String nova_data) {			//Método que altera a data de uma tarefa já adicionada;

		for (Tarefa tarefas : listaDeTarefa) {
			if (tarefas.equals(tarefa)) {
				tarefas.setData(nova_data);
				return true;
			}
		}
		return false;
		
	}

	static public boolean alteraStatus(Tarefa tarefa) {								//Método que altera o status de uma tarefa já adicionada;

		for (Tarefa tarefas : listaDeTarefa) {
			if (tarefas.equals(tarefa)) {
				if (tarefa.getStatus().equals(Status.Não_feita)) {
					tarefa.setStatus(Status.Feita);
					return true;
				}
			}
		}
		return false;
	}

	static boolean consultaTarefa(Tarefa tarefa) {									//Método que percorre o arrayliste e mostra a tarefa desejada pelo usuário;						
		for (Tarefa tarefas : listaDeTarefa) {
			if (tarefas.equals(tarefa)) {
				System.out.println("Descrição: " + tarefa.getDescricao() + "\nData: " + tarefa.getData() + "\nStatus: "
						+ tarefa.getStatus() + "\n-----------\n");
				return true;
			}
		}
		return false;
	}

	static public void imprimeLista() {												//Método que percorre o arraylist e printa as tarefas adicionadas;
		for (Tarefa tarefa : listaDeTarefa) {
			System.out.println("Descrição: " + tarefa.getDescricao() + "\nData: " + tarefa.getData() + "\nStatus: "
					+ tarefa.getStatus() + "\n-----------------\n");
		}
	}
	
	static public void limpaLista() {												//Método que atribuiu o valor vazio a lista;
		listaDeTarefa = null;
	}

}
