package ListaDeTarefas;

import java.util.Calendar;

public class Data {
	Calendar dataLimite;

	public void setdata(String data) {         
		
		String[] arrayData = data.split("/");							//Cria o array string e ir� quebrar a data em dia e m�s;
		int[] arrayDiaEMes = new int[2];								//Criando o Array em que a data ser� armazenada;
		arrayDiaEMes[0] = Integer.valueOf(arrayData[0]);				//Converte cada String em um inteiro e atribui ao arrayDiaEMes;
		arrayDiaEMes[1] = Integer.valueOf(arrayData[1]);
		
		this.dataLimite = Calendar.getInstance();						//Recupera a inst�ncia de calend�rio;
		this.dataLimite.set(Calendar.DAY_OF_MONTH, arrayDiaEMes[0]);	//Atribui o valor inteiro pro dia no calend�rio;
		this.dataLimite.set(Calendar.MONTH, arrayDiaEMes[1]);			//Atribui o valor inteiro pro m�s no calend�rio;
		
		
	}
	
	
	//sobrescrevendo o m�todo toString.
	@Override
	public String toString() {
		
		return this.dataLimite.get(Calendar.DAY_OF_MONTH) + "/" + this.dataLimite.get(Calendar.MONTH);
	}
	
	Data(String data){
		setdata(data);
	}
	
	
	
}
