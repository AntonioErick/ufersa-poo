public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Homem();
        m.andar();
        //O método ver() é sobrescrito na classe Homem, então é esse que será chamado, mesmo estando dentro de Mamifero
    }
}
