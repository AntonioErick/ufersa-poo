package Application;

import java.util.Scanner;

/*
Escreva um programa que receba uma temperatura em graus centígrados e a apresente
em graus Fahrenheit.
*/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe uma temperatura em graus centígrados: ");
		double gc = sc.nextDouble();
		
		double gf = gc * 9/5 + 32;
		
		System.out.printf("Graus Fahrenheit: %.2f", gf);
		
		sc.close();
	}

}
