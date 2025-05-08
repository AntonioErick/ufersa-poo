package Application;

/*
Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A
cidade A tem um crescimento populacional de 3, 5% ao ano, enquanto a população da

cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quanti-
dade de anos necessária para que a população da cidade A seja maior ou igual a popu-
lação da cidade B.
*/

public class Program {

	public static void main(String[] args) {
		
		double cidadeA = 7000;
		double cidadeB = 20000;
		
		for(int i = 0; cidadeA > cidadeB; i++) {
			cidadeA += cidadeA * 0.035;
			cidadeB += cidadeB * 0.01;
			
			if(cidadeA > cidadeB) {
				System.out.printf("Cidade A será maior que a cidade B em %d anos", i);
			}
		}
	}
	
}
