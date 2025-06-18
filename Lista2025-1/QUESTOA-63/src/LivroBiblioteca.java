public class LivroBiblioteca extends Livro{
    private String codigo;
    private boolean disponivel;
    
    public LivroBiblioteca(String titulo, String autor, int anoPublicado, String codigo, boolean disponivel) {
        super(titulo, autor, anoPublicado);
        this.codigo = codigo;
        this.disponivel = disponivel;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String toString() {
        return super.toString() + ", codigo:" + codigo + ", disponivel: " + (disponivel == true ? "sim" : "nao");
    }
}
