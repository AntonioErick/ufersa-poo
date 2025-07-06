public class App {
    public static void main(String[] args) throws Exception {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("Argamehd", "Carlos", 34, 2025, true, "loja virtual");
        
        System.out.println(livro);
        System.out.println((livro.estaEmprestado() ? "Esta emprestado" : "Nao esta emprestado"));
        livro.devolve();
        System.out.println((livro.estaEmprestado() ? "Esta emprestado" : "Nao esta emprestado"));
        System.out.println(livro.localizacao());
        System.out.println(livro.descricao());

    }
}
