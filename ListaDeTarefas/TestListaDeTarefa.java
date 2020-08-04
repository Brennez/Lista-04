package ListaDeTarefas;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestListaDeTarefa {

	@Test
	public void testAdicionaTarefa() {
		// dado que...
		Tarefa teste = new Tarefa("Teste", "28/07");
		// Quando eu...
		ListaDeTarefas.adicionaTarefa(teste);
		// Espero que...
		assertTrue(ListaDeTarefas.getListaDeTarefa() != null);
		ListaDeTarefas.limpaLista();
	}

	@Test
	public void testRemoveTarefa() {
		// dado que...
		Tarefa teste = new Tarefa("Teste", "28/07");
		// Quando eu...
		ListaDeTarefas.adicionaTarefa(teste);
		boolean resultado = ListaDeTarefas.removeTarefa(teste);
		// Espero que...
		assertTrue(resultado);
		ListaDeTarefas.removeTarefa(teste);
	}

	@Test
	public void testAlteraData() {
		// dado que...
		Tarefa teste = new Tarefa("Teste", "28/07");
		// Quando eu...
		ListaDeTarefas.adicionaTarefa(teste);
		boolean resultado = ListaDeTarefas.alteraData(teste, "25/04");
		// Espero que...
		assertTrue(resultado);
		ListaDeTarefas.limpaLista();
	}

	@Test
	public void testAlteraDescricao() {
		// dado que...
		Tarefa teste = new Tarefa("Teste", "28/07");
		// Quando eu...
		ListaDeTarefas.adicionaTarefa(teste);
		boolean resultado = ListaDeTarefas.alteraDescricao(teste, "teste2");
		// Espero que...
		assertTrue(resultado);
		ListaDeTarefas.limpaLista();
	}

	@Test
	public void testAlteraStatus() {
		// dado que...
		Tarefa teste = new Tarefa("Teste", "28/07");
		// Quando eu...
		ListaDeTarefas.adicionaTarefa(teste);
		boolean resultado = ListaDeTarefas.alteraStatus(teste);
		// Espero que...
		assertTrue(resultado);
		ListaDeTarefas.limpaLista();
	}

	@Test
	public void testConsultarTarefa() {
		// dado que...
		Tarefa teste = new Tarefa("Teste", "28/07");
		// Quando eu...
		ListaDeTarefas.adicionaTarefa(teste);		
		boolean resultado = ListaDeTarefas.consultaTarefa(teste);
		;
		// Espero que...
		assertTrue(resultado);
		ListaDeTarefas.limpaLista();
	}
}
