package Application;

import java.util.Scanner;

/*
 Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
dois setores:
• No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
500 vão ter 10% de desconto.
• No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.

 */

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[ELETROS - 222] [MOBILHA - 1111]");
		System.out.println("-------------------------------------------");
		System.out.print("Informe o setor: ");
		int setor = sc.nextInt();
		double preco;
		
		if (setor == 222 || setor == 111) {
			System.out.print("Informe o valor: R$ ");
			preco = sc.nextDouble();
			System.out.println("-------------------------------------------");
			desconto(preco, setor);
		}
		else {
			System.out.println("-------------------------------------------");
			System.out.println("Setor invalido.");
		}
		System.out.println("-------------------------------------------");
		
		sc.close();
	}
	
	public static double desconto(double preco, int setor) {
		if(setor == 222) {
			if(preco > 500) {
				preco -= preco * 0.10;
				System.out.printf("O valor final é R$ %.2f\n", preco);
			}
			else System.out.printf("O valor final é R$ %.2f\n", preco);
		}
		else{
			if(preco > 100) {
				preco -= preco * 0.40;
				System.out.printf("O valor final é R$ %.2f\n", preco);
			}
			else if(preco < 100 && preco > 50) {
				preco -= preco * 0.20;
				System.out.printf("O valor final é R$ %.2f\n", preco);
			}
			else {
				preco -= preco * 0.10;
				System.out.printf("O valor final é R$ %.2f\n", preco);
			}
		}
		return preco;
	}

}
