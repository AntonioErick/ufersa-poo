package Application;

/*
Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma
que n > 0.
 */

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Fibonacci:");
		
		long n = 0; //usei long pois o int tem um limite de tamanho
		long aux1 = 1;
		
		for(int i = 0; i < 100; i++) {
			
			long aux2 = n + aux1;
			n = aux1;
			aux1 = aux2;
			System.out.println(n);
		}
		
	}

}
