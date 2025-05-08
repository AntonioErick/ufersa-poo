package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 3 valores para calcular a média aritmética:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		double media = Media(n1, n2, n3);
		
		System.out.println("Media: "+media);
		
		sc.close();
	}
	
	public static double Media(double n1, double n2, double n3) {
		return (n1+n2+n3)/3;
	}

}
