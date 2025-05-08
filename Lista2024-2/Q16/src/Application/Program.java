package Application;

/*
Escreva um programa que determine quais são todos os números de 3 algarismos cuja
soma dos cubos de seus algarismos sejam iguais ao próprio número.
• Exemplo: 153 = 13 + 53 + 33 = 1 + 125 + 27.
*/

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Números de 3 algarismos cuja soma dos cubos de seus algarismos "
				+ "sejam iguais ao próprio número.");

		for(int i = 100; i < 1000; i++) {
			int centena = i / 100;
			int dezena = (i / 100) % 10;
			int unidade = i % 10;
			
			int somaCubos = (centena*centena*centena) + (dezena*dezena*dezena) + (unidade*unidade*unidade);
			
			if(somaCubos == i) {
				System.out.println(i);
			}
		}
	}

}
