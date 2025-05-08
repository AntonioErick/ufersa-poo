package Introjava;

import java.util.Scanner;

public class FatorialRecursivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o numero que deseja obter o fatorial: ");
		int n = sc.nextInt();
		
		int fat = fatorial(n);
		
		System.out.println("O fatorial de "+n+" é "+fat);
		
		sc.close();
	}
	
	public static int fatorial(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return n * fatorial(n-1);
		}
	}

}
