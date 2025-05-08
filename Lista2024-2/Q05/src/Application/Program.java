package Application;

import java.util.Locale;
import java.util.Scanner;

/*
Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve
ser reescrito como 312.
*/
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe um valor com uma centena, dezena e unidade: ");
		double cdu = sc.nextDouble();
		
		//vai resultar em um numero fracionado, mas como esta sendo convertido para inteiro, ira ser 
		//considerado apenas o numero antes da virgula
		int c = (int) (cdu / 100); 
		//vai resultar em um numero fracionado, vai ser considerado apenas os numeros após a virgula da divisao por 10
		int d = (int) (cdu / 10) % 10;
		// vai ser considerado apenas os numeros após a virgula da divisao por 10
		int u = (int) (cdu % 10);
		
		System.out.println("Reescrevendo o número no formato UCD: " +u+d+c);
		
		sc.close();
	}

}
