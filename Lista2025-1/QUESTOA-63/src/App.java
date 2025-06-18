public class App {
    public static void main(String[] args) throws Exception {
        LivroLivraria lv = new LivroLivraria("Argamed", "Carlos", 2025, 440, 12);
        LivroBiblioteca lb = new LivroBiblioteca("Calculo I", "Thomas Stwert", 1972, "1000g9", true);

        System.out.println(lv);
        System.out.println(lb);
    }
}
