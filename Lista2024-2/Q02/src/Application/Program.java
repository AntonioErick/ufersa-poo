package Application;

import java.util.Locale;
import java.util.Scanner;

/*
Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
valores reais serão informados pelo usuário.
*/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Informe 3 valores para calcular a soma e a média: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		double soma = n1 + n2 + n3;
		double media = (n1 + n2 + n3)/3;
		
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+media);
		
		sc.close();
	}

}
