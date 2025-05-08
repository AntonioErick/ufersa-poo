package Application;

import java.util.Scanner;

//Escreva um programa que lê três números e determina qual número é o menor.

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.println("Informe 3 numeros: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior número é "+n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior número é "+n2);
		}
		else System.out.println("O maior número é "+n3);
		
		sc.close();
	}

}
