package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
dois setores:
• No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
500 vão ter 10% de desconto.
• No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.
Escreva um programa que recebe do usuário o código do setor da loja e o valor original de
um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido. 
*/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Double> eletro = new ArrayList<>();
		List<Double> forniture = new ArrayList<>();
		
		System.out.println("-----------------------------------------------");
		System.out.print("Quantos itens deseja adicionar ao sistema? ");
		int n = sc.nextInt();
		
		System.out.println("-----------------------------------------------");
		System.out.println("Eletro = 222");
		System.out.println("Mesa, cama e banho = 111");
		System.out.println("-----------------------------------------------");
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			
			System.out.print((i + 1) + "º Produto - Código: ");
			int code = sc.nextInt();
			
			System.out.print((i + 1) + "º Produto - Preço: ");
			double price = sc.nextDouble();
			
			System.out.println("-----------------------------------------------");
			
			if(code == 111) {
				if(price > 100) {
					price -= price * 0.40;
				}
				else if(price >= 50 && price <= 100) {
					price -= price * 0.20;
				}
				else {
					price -= price * 0.10;
				}
				forniture.add(price);
			}
			
			else if(code == 222) {
				if(price > 500) {
					price -= price * 0.10;
				}
				eletro.add(price);
			}
			else {
				System.out.println("Código invalido. Tente novamente:");
				i--;
			}
		}
		
		System.out.println("Setor de Eletros: ");
		if(!eletro.isEmpty()) {
			for(double p : eletro) {
				System.out.printf("R$ %.2f\n", p);
			}
		}
		else {
			System.out.println("Nenhum produto encontrado");
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Setor de Mesa, cama e banho: ");
		if(!forniture.isEmpty()) {
			for(double p : forniture) {
				System.out.printf("R$ %.2f\n", p);
			}
		}
		else {
			System.out.println("Nenhum produto encontrado");
		}
		System.out.println("-----------------------------------------------");
		
		sc.close();
	}

}
