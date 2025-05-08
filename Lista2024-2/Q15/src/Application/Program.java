package Application;

/*
Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito
é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos:
6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14.
*/

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Os 4 primeiros números perfeitos: ");
		
		int countNum = 0;
		int num = 2; //começa em dois pois 2 é um número primo
		
		while(countNum < 4) {
			num += 1;
			if(perfeito(num)) {
				System.out.println(num);
				countNum++;
			}
		}
	}
	
	public static boolean perfeito(int num) {
		int soma = 1; //inicia em 1 pois 1 é o divisor comum de todos os números
		
		for(int i = 2; i <= num/2; i++) { //vai funcionar até que i seja a metade do num
			if(num % i == 0) { //se num for divisível por i, significa que i é um divisor de num.
				soma += i; //adiciona a soma o valor de i que nesse caso é o valor da divisao por 2
			}
		}
		
		return soma == num; //retorna o valor do num
	}
}
