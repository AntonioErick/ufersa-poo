package Application;

import java.util.Scanner;

/*
Crie uma função recursiva potencia(base,expoente) que, quando chamada, retorna baseexpoente
.
Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas
81 nesse exemplo)
Assuma que expoente é um inteiro maior ou igual a 1.
 */

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero para a base: ");
		int base = sc.nextInt();
		
		System.out.print("Informe um numero para o expoente: ");
		int expoente = sc.nextInt();
		
		int resultado = potencia(base, expoente);
		System.out.println(resultado);
		
		sc.close();
	}

	//Chamada recursiva acontece quando uma função chama a si mesma dentro do seu próprio corpo
	public static int potencia(int base, int expoente) {
		if(expoente == 1) {
			return base;
		}
		return base * potencia(base, expoente - 1);
	}
}
