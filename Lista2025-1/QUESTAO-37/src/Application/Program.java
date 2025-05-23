package Application;

import Utilities.Contador;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("[1] Imcrementar");
        System.out.println("[2] Mostrar");
        System.out.println("[3] Zerar");
        System.out.println("[4] Encerrar");

        int op = 0;

        while (op != 4) {
           op = sc.nextInt(); 

           switch (op) {
            case 1:
                Contador.incrementar();
                break;
            case 2:
                System.out.println("=="+Contador.mostrarContador()+"==");
                break;
            case 3:
                Contador.zerar();
                break;
    
            default:
                break;
           }
        }

        sc.close();
    }
}
