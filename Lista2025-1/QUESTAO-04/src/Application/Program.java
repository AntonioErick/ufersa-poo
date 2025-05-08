package Application;

import java.util.Scanner;

/*
Escreva um programa que receba uma temperatura em graus centígrados e a apresente
em graus Fahrenheit.
*/

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor em graus celsius: ");
		int celsius = sc.nextInt();
		
		int fahrenheit = celsius * 9/5 + 32;
		
		System.out.println("O valor em Fahrenheit vai ser "+fahrenheit);

		sc.close();
	}

}
