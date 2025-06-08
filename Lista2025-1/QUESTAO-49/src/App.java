public class App {
    public static void main(String[] args) throws Exception {
        Matriz mat = new Matriz(4, 2, 1, 3);
        mat.imprimir();
        System.out.println("Determinante: " + mat.determinante());
    }
}
