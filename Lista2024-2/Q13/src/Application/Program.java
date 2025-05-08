package Application;

import java.util.Random;

/*
Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
(somente com os números, respeitando o número de linhas e a distribuição dos números
nas linhas).
 */

public class Program {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] mat = new int[10][6];
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 6; j++) {
				int num = random.nextInt(60) + 1; 
				mat[i][j] = num;
			}
		}
		
		System.out.println("Cartão da Mega-Sena:");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
