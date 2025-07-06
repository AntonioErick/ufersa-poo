public class Livro {
    private String titulo;
    private String autor;
    private int numDePaginas;
    private int anoDaEdicao;
    
    public Livro(String titulo, String autor, int numDePaginas, int anoDaEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numDePaginas = numDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    public String qualTitulo() {
        return titulo;
    }

    public String qualAutor() {
        return autor;
    }

    public String toString() {
        return "Titulo:" + titulo + ", autor:" + autor + ", nummero de paginas:" + numDePaginas + ", ano da edicao:" + anoDaEdicao;
    }
}
