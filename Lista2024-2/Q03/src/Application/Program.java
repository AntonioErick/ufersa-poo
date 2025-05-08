package Application;

import java.util.Scanner;

/*
Escreva um programa que receba um ângulo em graus e o converta para sua represen-
tação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e
cotangente do ângulo.
*/

public class Program {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Informe um angulo em grau para converter em radiano: ");
	double grau = sc.nextDouble();
	
	double radiano = grau * Math.PI/180;
	
	double sen = Math.sin(radiano);
	double cos = Math.cos(radiano);
	double tan = 0, cossec = 0, secant = 0, cotan = 0;
	
	if(sen != 0) {
		cossec = 1/ sen;
	}

	if(cos != 0) {
		tan = Math.tan(radiano);
		secant = 1 / cos;
		cotan = 1 / tan;
	}
	
	System.out.printf("Radiano: %.2f\n", radiano);
	System.out.printf("Seno: %.2f\n", sen);
	System.out.printf("Cosseno: %.2f\n", cos);
	System.out.printf("Tangent: %.2f\n", tan);
	System.out.printf("Cossecante: %.2f\n", cossec);
	System.out.printf("Secante: %.2f\n", secant);
	System.out.printf("Cotangente: %.2f\n", cotan);

	sc.close();
	}

}
