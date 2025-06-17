package Empresa;

public class Program {
    public static void main(String[] args) {
        EmpregadoAssalariado a = new EmpregadoAssalariado("Erick", "abc", 2873.50F);
        Fatura f = new Fatura(10, 34.70F);

        imprimeCustoPagamento(a);
        imprimeCustoPagamento(f);
;    }

    public static void imprimeCustoPagamento(Pagavel pag){
        System.out.println("Custo do pagamento é: " + pag.obterPagamento());
    }
}
