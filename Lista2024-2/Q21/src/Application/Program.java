package Application;

import java.util.Scanner;

//Crie uma função recursiva que verifique se um dado número é primo.

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int n = sc.nextInt();
		
		sc.close();
	}

	public static boolean primo(int n) {
		
		if(n < 1) {
			System.out.println("Um número primo tem que ser número natural maior que 1.");
			return -1;
		}
		else {
			primo(n % n == 1);
		}
	}
}
