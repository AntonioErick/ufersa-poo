package Application;

import java.util.Scanner;

/*
Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. O mdc de
m e n é definido recursivamente como segue:
• se n > m, retorne mdc(n, m);
• se n = 0, retorne m;
• senão, retorne mdc(n, m%n), onde % é o operador de resto da divisão.
 */

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe dois numero para pegar o maximo divisor comum: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int resultado = mdc(m, n);
		System.out.printf("O MDC de %d e %d é: %d", m, n, resultado);
		
		sc.close();
	}
	
	public static int mdc(int m, int n) {
		if(n > m) {
			return mdc(n,m); //inverte os valores
		}
		else if(n == 0) {
			return m;
		}
		else {
			return mdc(n, m % n);
		}
	}

}
