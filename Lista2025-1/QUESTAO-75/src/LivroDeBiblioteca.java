public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean disponivel;
    private String localizacao;

    public LivroDeBiblioteca(String titulo, String autor, int numDePaginas, int anoDaEdicao, boolean disponivel, String localizacao) {
        super(titulo, autor, numDePaginas, anoDaEdicao);
        this.disponivel = disponivel;
        this.localizacao = localizacao;
    }

    @Override
    public String descricao() {
        return "Livro: " + qualTitulo() + " de " + qualAutor();
    }

    @Override
    public void devolve() {
        disponivel = false;
    }

    @Override
    public void empresta() {
        disponivel = true;
    }

    @Override
    public boolean estaEmprestado() {
        return disponivel;
    }

    @Override
    public String localizacao() {
        return localizacao;
    }

    @Override
    public String qualAutor() {
        return super.qualAutor();
    }

    @Override
    public String qualTitulo() {
        return super.qualTitulo();
    }

    @Override
    public String toString() {
        return super.toString() + ", localizacao: "+localizacao+", disponivel: "+(disponivel == false ? "Sim" : "Nao");
    }     
}
