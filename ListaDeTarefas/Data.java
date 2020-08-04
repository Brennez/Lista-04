package ListaDeTarefas;

import java.util.Calendar;

public class Data {
	Calendar dataLimite;

	public void setdata(String data) {         
		
		String[] arrayData = data.split("/");							//Cria o array string e irá quebrar a data em dia e mês;
		int[] arrayDiaEMes = new int[2];								//Criando o Array em que a data será armazenada;
		arrayDiaEMes[0] = Integer.valueOf(arrayData[0]);				//Converte cada String em um inteiro e atribui ao arrayDiaEMes;
		arrayDiaEMes[1] = Integer.valueOf(arrayData[1]);
		
		this.dataLimite = Calendar.getInstance();						//Recupera a instância de calendário;
		this.dataLimite.set(Calendar.DAY_OF_MONTH, arrayDiaEMes[0]);	//Atribui o valor inteiro pro dia no calendário;
		this.dataLimite.set(Calendar.MONTH, arrayDiaEMes[1]);			//Atribui o valor inteiro pro mês no calendário;
		
		
	}
	
	
	//sobrescrevendo o método toString.
	@Override
	public String toString() {
		
		return this.dataLimite.get(Calendar.DAY_OF_MONTH) + "/" + this.dataLimite.get(Calendar.MONTH);
	}
	
	Data(String data){
		setdata(data);
	}
	
	
	
}
