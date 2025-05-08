package Application;

public class Fatura {
    int id;
    String descricao;
    int qtdComprada;
    double preco;
    
    Fatura( int id,  String descricao, int qtdComprada, double preco){
        this.id = id;
        this.descricao = descricao;
        this.qtdComprada = (qtdComprada<0 ? 0 : qtdComprada);
        this.preco = (preco<0 ? 0.0 : preco);
    }

    double calculoTotal(){
        return qtdComprada * preco;
    }

    void exibirFatura(){
        System.out.println("Descriçao: "+descricao);
        System.out.println("Quantidade comprada: "+qtdComprada);
        System.out.println("Preço: "+preco);
        System.out.println("Valor da fatura: "+calculoTotal());
    }
}
