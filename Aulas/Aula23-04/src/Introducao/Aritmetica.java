package Introducao;

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1, y1, x2, y2, dist;
		
		System.out.println("Informe os pontos x1 e y1: ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		System.out.println("Informe os pontos x2 e y2: ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		// raiz((x2-x1)^2 + (y2-y1)^2)
		dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		System.out.println("A distancia entre ("+x1+", "+y1+") e ("+x2+", "+y2+") é: "+dist);
		
		sc.close();
	}
}
