import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int[] somas = new int[13];
        int dado1, dado2, soma;

        for(int i = 0; i < 36000000; i++){
            dado1 = rand.nextInt(6) + 1;
            dado2 = rand.nextInt(6) + 1;
            soma = dado1 + dado2;
            somas[soma]++;
        }

        System.out.println("Soma | Frequencia");
        for(int i = 2; i <= 12; i++){
            System.out.printf("%2d | %,d%n", i, somas[i]);
        }
    }
}
