public class LivroLivraria extends Livro{
    private double preco;
    private int qtd;
    
    public LivroLivraria(String titulo, String autor, int anoPublicado, double preco, int qtd) {
        super(titulo, autor, anoPublicado);
        this.preco = preco;
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public String toString() {
        return super.toString() + ", preco: " + preco + ", quantidade: " + qtd;
    }
}
