package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Fatura;

/*
Crie uma classe chamada F atura para que uma loja de suprimentos de informática a

utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as se-
guintes informações sobre o item vendido: o número de identificação, a descrição, a

quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada.
*/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe a descriçao produtos deseja vender: ");
		String description = sc.nextLine();
		
		System.out.print("Informe o ID produto: ");
		int id = sc.nextInt();
		
		System.out.print("Informe o total de unidades: ");
		int qtd = sc.nextInt();
		
		System.out.print("Informe o preço por unidade: ");
		double price = sc.nextDouble();
		
		Fatura fatura = new Fatura(id, description, price, qtd);
		
		double finalPrice = fatura.calculoTotal(qtd, price);
		
		System.out.println("------------------------------------------------");
		System.out.println(fatura.toString());
		System.out.printf("Total value: R$%.2f\n", finalPrice);
		System.out.println("------------------------------------------------");
		sc.close();
	}

}
