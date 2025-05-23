package Application;

import Entities.Elevador;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        Elevador elevador = new Elevador(0, 10, 5, 0);

        System.out.println("[1] - Subir");
        System.out.println("[2] - Descer");
        System.out.println("[3] - Entrar");
        System.out.println("[4] - Sair");
        System.out.println("[333] - Encerrar programa");
        System.out.println(elevador.toString());

        int op = 0;

        while(op != 333){
            op = sc.nextInt();
            switch (op) {
                case 1:
                    elevador.subir();
                    System.out.println(elevador.toString());
                    break;
                case 2:
                    elevador.descer();
                    System.out.println(elevador.toString());
                    break;
                case 3:
                    elevador.entrar();
                    System.out.println(elevador.toString());
                    break;
                case 4:
                    elevador.sair();
                    System.out.println(elevador.toString());
                    break;
                case 333:
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }

        sc.close();
    }
}
