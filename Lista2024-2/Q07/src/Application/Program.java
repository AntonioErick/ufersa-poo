package Application;

import java.util.Scanner;

//Escreva um programa que lê três números e determina qual número é o menor.

public class Program {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Informe 3 valores: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		if (n1 > n2 && n3 > n2) {
			System.out.println("O menor número é: "+n2);
		}
		if (n2 > n3 && n1 > n3) {
			System.out.println("O menor número é: "+n3);
		}
		else {
			System.out.println("O menor número é: "+n1);
		}
		
		sc.close();
	}
}
