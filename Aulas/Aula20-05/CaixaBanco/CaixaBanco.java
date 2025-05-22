package CaixaBanco;

public class CaixaBanco {
    public static int clientesAtendidos = 0;
    private int numCaixa;

    public CaixaBanco(int numCaixa) {
        this.numCaixa = numCaixa;
    }

    public void iniciarAtendimento(){
        clientesAtendidos++;
        System.out.println("Caixa "+numCaixa+" atendendo o cliente "+ ++clientesAtendidos);
    }

    public static void imprimirClientes(){
        System.out.println("Clientes atendidos: "+clientesAtendidos);
    }
}
