package Application;

/*
Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o número do andar atual, o total de
andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele.
Outras classes não devem ter acesso direto aos atributos de Elevador. A classe deve
também disponibilizar os seguintes métodos:
• construtor : que deve receber como parâmetros a capacidade do elevador e o total
de andares no prédio (um elevador sempre começa no térreo e vazio);
• entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
• sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
• sobe : para subir um andar (não deve subir se já estiver no último andar);
• desce : para descer um andar (não deve descer se já estiver no térreo).
Escreva um aplicativo de teste que demonstre as capacidades da classe criada, ou seja,
execute todos os métodos da classe.
*/

import java.util.Scanner;

import Entities.Elevador;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Elevador elevador = new Elevador(5, 10);
		
		int op = 0;
		
		do {
			options();
			op = sc.nextInt(); 
			
			switch(op){
				case 1:
					elevador.Enter();
					break;
				
				case 2:
					elevador.Leave();
					break;
				
				case 3:
					elevador.UpFloor();;
					break;
					
				case 4:
					elevador.DownFloor();
					break;
					
				case -1:
					break;
				
				default: 
					System.out.println("Invalid option.");
					break;
			}
		}while(op != -1);
		
		sc.close();
	}
	
	public static void options() {
		System.out.println("1 - Enter");
		System.out.println("2 - Leave");
		System.out.println("3 - Up");
		System.out.println("4 - Down");
	}

}
