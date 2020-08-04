package ListaDeTarefas;

public class Tarefa {
	
	//Criando os atributos de tarefa;
	private String descricao;
	private Status status;
	private Data data;
	
	//Constutor da classe tarefa;
	Tarefa(String descricao, String data){
		this.descricao = descricao;
		this.data = new Data(data);
		this.status = Status.Não_feita;
	}
	
	
	//sobrescrevendo o método equals
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;

		Tarefa t;
		if (o instanceof Tarefa)
			t = (Tarefa) o;
		else
			return false;

		if (this.descricao.equals(t.descricao) && this.data.equals(t.data) && this.status == t.status)
			return true;
		return false;
	}
	
	// getters e setters dos atributos da classe tarefa;
	public Data getData() {
		return data;
	}
	public void setData(String data) {
		this.data.setdata(data);
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
}
