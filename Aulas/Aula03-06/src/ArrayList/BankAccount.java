package ArrayList;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Extrato conta = new Extrato();

        int op = sc.nextInt();

        do{
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Visualizar extrato");
            System.out.println("4 - Encerrar aplicaçao");
            System.out.println();
            switch (op) {
                case 1:
                    System.out.println("Qual o valor do saque?");
                    float valor = sc.nextFloat();
                    conta.transacao(valor);
                    break;
                
                case 2:
                    System.out.println("Qual o valor do deposito?");
                    float valor2 = sc.nextFloat();
                    conta.transacao(valor2);
                    break;
                
                case 3:
                    System.out.println(conta);
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;
            
                default:
                    break;
            }
        }while(op!=4);

        sc.close();
    }
}
