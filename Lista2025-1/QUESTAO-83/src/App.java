public class App {
    public static void main(String[] args) throws Exception {
        Aparelho geladeira = new Geladeira();
        Aparelho tv = new TV();
        geladeira.liga();
        tv.liga();
    }
}
