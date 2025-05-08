package Introducao;

import java.util.Scanner;

public class EstruturasDeControle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dia, mes, ano;
		
		System.out.print("Informe o dia: ");
		dia = sc.nextInt();
		System.out.print("Informe o mes: ");
		mes = sc.nextInt();
		System.out.print("Informe o ano: ");
		ano = sc.nextInt();
		
		System.out.print(dia+" de ");
		if(mes == 1) {
			System.out.print("janeiro");
		}
		else if(mes == 2) {
			System.out.print("fevereiro");
		}
		else if(mes == 3) {
			System.out.print("março");
		}
		else if(mes == 4) {
			System.out.print("abril");
		}
		else if(mes == 5) {
			System.out.print("maio");
		}
		else if(mes == 6) {
			System.out.print("junho");
		}
		else if(mes == 7) {
			System.out.print("julho");
		}
		else if(mes == 8) {
			System.out.print("agosto");
		}
		else if(mes == 9) {
			System.out.print("setembro");
		}
		else if(mes == 10) {
			System.out.print("outubro");
		}
		else if(mes == 11) {
			System.out.print("novembro");
		}
		else{
			System.out.print("desembro");
		}
		
		System.out.print(" de "+ano);
		
		int diasMes;
		
		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 11:
			case 12:
				diasMes = 31;
				System.out.println(diasMes+" dias");
				break;
			
			case 2:
				diasMes = 28;
				System.out.println(diasMes+" dias");
				break;
			
			default:
				diasMes = 30;
				System.out.println(diasMes+" dias");
				break;
		}
		
		System.out.println("");
		
		sc.close();
	}
}
