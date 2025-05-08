package Application;

import java.util.Scanner;

/*
 Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos. 
 Divulgue também seno, cosseno, tangente, cossecante, secante e cotangente do ângulo.
*/

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double grau, radiano, seno, cosseno, tangente; 
		double cossecant = 0, secante= 0, cotangente= 0;
		
		System.out.print("Informe um angulo em graus: ");
		grau = sc.nextInt();
		
		radiano = Math.toRadians(grau);
		seno = Math.sin(radiano);
		cosseno = Math.cos(radiano);
		tangente = Math.tan(radiano);
		
		if(seno != 0) {
			cossecant = 1/seno;
		}
		else if(seno != 360){
			cossecant = 0;
		}
		if(tangente != 0) {
			cotangente = seno/cosseno;
		}
		if(cosseno != 0) {
			secante = 1/cosseno;
		}
		
		System.out.printf("Grau: %.2f\n", grau);
		System.out.printf("Radiano: %.2f\n", radiano);
		System.out.printf("Seno: %.2f\n", seno);
		System.out.printf("Cosseno: %.2f\n", cosseno);
		System.out.printf("Tangente: %.2f\n", tangente);
		System.out.printf("Cossecant: %.2f\n", cossecant);
		System.out.printf("Secant: %.2f\n", secante);
		System.out.printf("Cotangente: %.2f\n", cotangente);
		
		sc.close();
	}

}
