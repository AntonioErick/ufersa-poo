package Application;

/*
Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.
 */

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x1, x2, y1, y2;
		
		System.out.println("Informe o valor de x1:");
		x1 = sc.nextInt();
		
		System.out.println("Informe o valor de y1:");
		y1 = sc.nextInt();

		System.out.println("Informe o valor de x2:");
		x2 = sc.nextInt();
		
		System.out.println("Informe o valor de y2:");
		y2 = sc.nextInt();
		
		if(x2 < x1) {
			System.out.print("Está a esquerda");
		}
		else {
			System.out.print("Está a direita");
		}
		
		if(y2 < y1) {
			System.out.print(" e abaixo do primeiro.");
		}
		else {
			System.out.print(" e acima do primeiro.");
		}
		
		sc.close();
	}

}
