package Application;

import java.util.Scanner;

public class Fatoriais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, aux1 = 1;
		
		System.out.print("Informe o valor de n: ");
		n = sc.nextInt();
		
		for(int i = 2; i <= n; i++) {
			aux1 *= i;
			System.out.println("Fatorial de "+i+" é igual a "+aux1);
		}

		sc.close();
	}

}
