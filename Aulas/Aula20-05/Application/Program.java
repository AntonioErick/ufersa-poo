package Application;

//import Entities.Account;
import CaixaBanco.CaixaBanco;

public class Program {
    public static void main(String[] args) {
        /* 
        Account conta = new Account("Erick", 110.5, true);
        Account conta2 = new Account("Erick");

        conta.setBalance(5000);
        System.out.println(conta.getBalance());

        System.out.println(conta);
        System.out.println(conta2);
        */

        System.out.println("Total de clientes atendidos: "+ CaixaBanco.clientesAtendidos);

        CaixaBanco caixa1 = new CaixaBanco(1);
        CaixaBanco caixa2 = new CaixaBanco(2);
        CaixaBanco caixa3 = new CaixaBanco(3);
        CaixaBanco caixa4 = new CaixaBanco(4);
        CaixaBanco caixa5 = new CaixaBanco(5);
        
        CaixaBanco.imprimirClientes();
        caixa1.iniciarAtendimento();

        CaixaBanco.imprimirClientes();
        caixa2.iniciarAtendimento();

        CaixaBanco.imprimirClientes();
        caixa3.iniciarAtendimento();

        CaixaBanco.imprimirClientes();
        caixa4.iniciarAtendimento();

        CaixaBanco.imprimirClientes();
        caixa5.iniciarAtendimento();

        CaixaBanco.imprimirClientes();
    }
}
