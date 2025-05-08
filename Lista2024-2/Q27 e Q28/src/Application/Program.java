package Application;

import java.util.Scanner;

import Utilities.Lampada;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Lampada light = new Lampada(false);

		System.out.println("--------------------------");
		System.out.println("1 - Turn light on");
		System.out.println("2 - Turn light off");
		System.out.println("3 - Show status");
		System.out.println("4 - Encerrar programa");
		System.out.println("--------------------------");
		
		int op = 0;
		
		do {
			op = sc.nextInt();
			switch(op) {
			case 1:
				light.turnOn();
				break;
			case 2:
				light.turnOff();;
				break;
			case 3:
				light.showStatus();;
				break;
			case 4:
				break;
			default:
				System.out.println("Opçao invalida");
				break;
			}
		}while(op != 4);
		
		sc.close();
	}

}
