package Application;

/*
Escreva uma classe para representar um time de um esporte qualquer em um campeo-
nato desse esporte. Que atributos devem ser representados nessa classe? Quais méto-
dos ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da
classe criada.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.VoleiTeam;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<VoleiTeam> players = new ArrayList<>(); 
		
		int op = 0;
		
		do {
		menu();
		op = sc.nextInt();
		sc.nextLine();
		
		switch(op) {
			case 1:
				System.out.print("Informe o nome do jogador: ");
				String name = sc.nextLine();
				
				System.out.print("Informe o numero do jogador: ");
				int num = sc.nextInt();
				
				players.add(new VoleiTeam(name, num));
				break;
				
			case 2:
				if(players.isEmpty()) {
					System.out.println("Nenhum jogador cadastrado!");
					break;
				}
				else {
					System.out.print("Informe o numero do jogador que deseja remover: ");
					num = sc.nextInt();
					
					for(VoleiTeam player : players) {
						if(player.getNum() == num) {
							System.out.println(player+" removido!");
							break;
						}
						else {
							System.out.println("Jogador nao encontrado.");
							break;
						}
					}
				}
				break;
				
			case 3:
				if(players.isEmpty()) {
					System.out.println("Nenhum jogador cadastrado!");
					break;
				}
				else {
				System.out.print("Informe o numero do jogador que deseja editar: ");
				num = sc.nextInt();
				sc.nextLine();
				
					for(VoleiTeam player : players) {
						if(player.getNum() == num) {
							System.out.print("Informe o novo nome do jogador: ");
							name = sc.nextLine();
							
							System.out.print("Informe novo o numero do jogador: ");
							int newNum = sc.nextInt();
							
							 player.setPlayer(name);
	                         player.setNum(newNum);
	                         System.out.println("Jogador atualizado com sucesso!");
							break;
						}
						else {
							System.out.println("Jogador nao encontrado.");
							break;
						}
					}
				}
			
				break;
			
			case 4:
				System.out.println("Encerrando...");
				break;
			}
		
		}while(op != 4);
		
		sc.close();
	}

	public static void menu() {
		System.out.println("----------------------------------------------------");
		System.out.println("1 - Adicionar Jogador");
		System.out.println("2 - Remover Jogador");
		System.out.println("3 - Editar Jogadores");
		System.out.println("4 - Encerrar Jogo");
		System.out.println("----------------------------------------------------");
	}
}
