package Application;

import java.util.Scanner;

/*
 Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos
 */

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, minutos, horas, dias;
		
		System.out.print("Informe o valor em minutos: ");
		n = sc.nextInt();
		
		dias = n / 1440; //pois, fazendo 24*60, obtemos o total de minutos em um dia
		horas = n%1440/60;
		minutos = n%60;
		
		System.out.println(n+" minutos é igual a "+dias+" dias, "+horas+" e "+17+" minutos.");
		
		sc.close();
	}

}
