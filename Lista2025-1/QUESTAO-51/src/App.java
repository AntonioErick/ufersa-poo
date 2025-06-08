import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Erick", 2023011, 21, 92621417);
        Cliente c2 = new Cliente("Ragnar", 4566543, 31, 92621417);
        Cliente c3 = new Cliente("Luffy", 202354, 18, 92621417);
        Cliente c4 = new Cliente("Garp", 2344300, 75, 92621417);
        Cliente c5 = new Cliente("Pateta", 34598, 27, 92621417);

        ArrayList<Cliente> armazenar = new ArrayList<>();
        armazenar.add(c1);
        armazenar.add(c2);
        armazenar.add(c3);
        armazenar.add(c4);
        armazenar.add(c5);

        for(Cliente c : armazenar){
            System.out.println(c);
        }
    }
}
