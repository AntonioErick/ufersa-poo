package Application;

import java.util.Scanner;

/*
Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
variável de tipo inteiro. Por fim, reescreva o número no formato UCD em outra variável
de tipo inteiro e o imprima. Exemplo: 123 deve ser reescrito como 312.
 */
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cdu, c, d, u;
		
		System.out.print("Informe um valor de tres digitos: ");
		cdu = sc.nextInt();
		
		c = cdu/100;
		d = (cdu / 10)%10;
		u = cdu % 10;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(u);
		
		sc.close();
	}

}
