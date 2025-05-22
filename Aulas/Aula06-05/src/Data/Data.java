package Data;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	private boolean dataValida() {
		return (dia>0 && dia<=30 && mes>0 && mes<=12 && ano >=0);
	}
	
	public void inicializaData(int d, int m, int a) {
		dia = d;
		mes = m;
		ano = a;
		if(!dataValida()){
			dia = 1;
			mes = 1;
			ano = 2000;
		}
	}
	
	public void mostraData() {
		System.out.println(dia+"/"+mes+"/"+ano);
	}
}
