package Empresa;

public class Fatura implements Pagavel{
    private int qtd;
    private float preco;

    public Fatura(int qtd, float preco) {
        this.qtd = qtd;
        this.preco = preco;
    }

    @Override
    public float obterPagamento(){
        return qtd * preco;
    }

    @Override
    public String toString() {
        return "Quantidade: " + qtd + ", preco: " + preco;
    }
}
