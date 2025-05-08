package Application;

import java.util.Scanner;

/*
Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro. 
*/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe as cordendas de (x1 y1): ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		System.out.println("Informe as cordendas de (x2 y2): ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		if(y2 < y1) {
			System.out.print("Está abaixo ");
		}
		else if(y2 > y1) {
			System.out.print("Está acima ");
		}
		
		if(x1 > x2) {
			System.out.println("e a esquerda.");
		}
		else if(x1 < x2){
			System.out.println("e a direita.");
		}
		
		sc.close();
	}

}
