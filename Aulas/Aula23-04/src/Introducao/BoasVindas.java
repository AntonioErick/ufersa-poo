package Introducao;

import java.util.Scanner;

public class BoasVindas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		
		String nome = sc.nextLine();
		
		System.out.println("Bem vindo "+nome+"!");

		sc.close();
	}

}
