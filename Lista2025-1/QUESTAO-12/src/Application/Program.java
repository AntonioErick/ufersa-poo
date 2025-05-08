package Application;

import java.util.Scanner;

/*
O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
da semana correspondente.
• Exemplo de entrada: 10
• Exemplo de saída: O dia 10 será uma terça-feira.
*/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] dias = {"Domingo ", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

		System.out.print("Informe um dia do mês de fevereiro de 2015 (um valor entre 1 e 28): ");
		int num = sc.nextInt();
		
		if(num < 1 || num > 28) {
			System.out.println("Dia inválido.");
		}
		else {
			int posicao = (num-1)%7;
			System.out.println(dias[posicao]);
		}
		
		sc.close();
	}

}
