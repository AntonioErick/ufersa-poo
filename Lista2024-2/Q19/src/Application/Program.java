package Application;

import java.util.Scanner;

/*
Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recur-
siva, exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação).

Faça o melhor que você puder para tornar a saída limpa, interessante e significativa. Seu
objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento
da recursão.

3

Por exemplo, para uma entrada n = 5, o programa deve exibir:
0! = 1
	1! = 1
		2! = 2
			3! = 6
				4! = 24
					5! = 120
 */

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre o valor que deseja fatorar: ");
		int n = sc.nextInt();
		
		fatorial(n, 0);
	
		sc.close();
	}
	
	public static long fatorial(int n, int nivel) {
		//vai calcular usando o .repeat quantas vezes o recuo tem que ser usado
		String recuo = "\t".repeat(nivel); 
		
		if(n == 0) {  
			System.out.println(recuo + "0! = 1");
			return 1;  
		}  
		else {
			//sera armazenado na variavel o numero anterior a n com (n - 1) e aumentado o nivel em 1 para imprimir com o espaçamento
			long numAnterior = fatorial(n - 1, nivel + 1);
			//sera armazenado na variavel o valor da multiplicaçao do valor informado e dos numeros a medida que forem dcrementados
			long numAtual = n * numAnterior;
		  
		//será impresso na tela o valor do calculo ate que a chamada recursiva se encerre quando n vhegar em 0
		System.out.println(recuo + n + "! = " + numAtual);  
		
		return numAtual;  
		}  
	}
}
