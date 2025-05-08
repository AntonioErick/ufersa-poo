package Application;

import java.util.Scanner;

/*
Escreva um programa que calcule a área de um quadrado. O valor do lado de um qua-
drado deverá ser informado pelo usuário. 
*/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor de um lado do qudrado: ");
		int side = sc.nextInt();
		
		int value = side * side;
		
		System.out.println("O valor da área do quadrado é: "+value);
		
		sc.close();
	}

}
