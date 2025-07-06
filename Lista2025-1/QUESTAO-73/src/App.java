public class App {
    public static void main(String[] args) throws Exception {
        Desenho d1 = new Desenho(new Circulo(), 3, 6, new Quadrado(), 7, 14);
        Desenho d2 = new Desenho(new Quadrado(), 4, 8, new Triangulo(), 9, 18);

        System.out.println("-----DESENHO 1-----");
        d1.apresenta();

        System.out.println("-----DESENHO 2-----");
        d2.apresenta();
    }
}
