public class App {
    public static void main(String[] args) throws Exception {
        //Explique por que não podemos ter construtores declarados com a palavra-chave abstract.

        /*
        Uma classe abstrata não pode ser utilizada para instanciar objetos.

        Um construtor de uma superclasse nao pode ser herdado por suas subclasses, logo, nao faz sentido 
        tornar algo que nao pode ser herdado em abstract.

        Um construtor também nao pode ser sobrescrito e devem sempre ter uma implementacao correta
        para criar objetos.
        */
    }
}
