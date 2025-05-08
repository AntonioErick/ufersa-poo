package Application;

/*
Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
espadas). O programa deve imprimir o nome da carta por extenso.
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] valor = {"ás","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
		String[] naipe = {"Ouros","Paus","Copas","Espadas"};
		
		int n, v;
		
		System.out.print("Informe o valor da carta: ");
		v = sc.nextInt();
		
		System.out.print("Informe o naipe da carta: ");
		n = sc.nextInt();
		
		if(v < 1 || v > 13 || n < 1 || n > 4) {
			System.out.println("Informe valores validos. (Naipe 0-4) (Valor 0-13)");
		}
		else {
			System.out.println(valor[v -1]+" de "+naipe[n-1]);
		}

		sc.close();
	}

}
