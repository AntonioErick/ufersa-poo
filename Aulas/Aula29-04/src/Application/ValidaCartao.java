package Application;

import java.util.Calendar;
import java.util.Scanner;

public class ValidaCartao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();
		
		System.out.println(calendario.get(Calendar.MONTH)+1 +"/"+calendario.get(Calendar.YEAR));
		
		int mesAtual, anoAtual, mes, ano;
		boolean invalido;
		
		anoAtual = calendario.get(Calendar.YEAR);
		mesAtual = calendario.get(Calendar.MONTH);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Numero: ");
		String numero = sc.nextLine();
		
		System.out.print("Codigo: ");
		String codigo = sc.nextLine();
		
		do {
			System.out.print("Mes: ");
			mes = sc.nextInt();
			
			System.out.print("Ano: ");
			ano = sc.nextInt();
			
			invalido = ano < anoAtual || ano==anoAtual && mes < mesAtual;
			if(invalido) {
				System.out.println("Cartao invalido. Insira os dados novamente");
			}
		}while(invalido);
		
		System.err.println("Cartao Valido");
		
		sc.close();
	}

}
