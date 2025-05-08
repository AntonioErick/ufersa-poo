package Application;

import java.util.Scanner;

/*
Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.
*/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um valor inteiro representando minutos: ");
		int n1 = sc.nextInt();
		
		int dias = n1 / (60 * 24);
		int horas = (n1 % (60 *24)) / 60;
		int minutos = n1 % 60;
		
		System.out.printf("%d minutos = %d dias, %d horas e %d minutos.%n ", n1, dias, horas, minutos);
		
		sc.close();
	}

}
