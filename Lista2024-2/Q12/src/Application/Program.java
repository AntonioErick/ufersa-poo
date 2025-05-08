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

		String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabádo"};
		
		System.out.print("Digite um dia de fevereiro de 2015 (1-28): ");
        int dia = sc.nextInt();
        
        if(dia < 1 || dia > 28) {
        	System.out.println("Dia inválido.");
        }
        else {
        	int posicao = (dia - 1) % 7; //-1 pois o domingo no array começa na posiçao 0
        	System.out.printf("O dia %d será uma %s.", dia, dias[posicao]);
        }
        
		sc.close();
	}

}
