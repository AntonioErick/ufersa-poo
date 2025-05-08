package Application;

import java.util.Scanner;

/*
Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
espadas). O programa deve imprimir o nome da carta por extenso. 
*/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] valores = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String[] naipes = {"Ouros", "Paus", "Copas", "Espadas"};
		
		
		System.out.println("Informe um número que representa o valor da carta (1-13): ");
		int valor = sc.nextInt();

		System.out.println("(1 = ouros, 2 = paus, 3 = copas e 4 = espadas)");
		
		System.out.println("Informe um número que representa o naipe da carta: ");
		int naipe = sc.nextInt();
		
		if(valor < 1 || valor > 13 || naipe < 1 || naipe > 4) {
			System.out.println("Valores invalidos.");
		}
		else {
			System.out.println(valores[valor - 1] + " de " + naipes[naipe - 1]);
		}
		
		sc.close();
	}
}
