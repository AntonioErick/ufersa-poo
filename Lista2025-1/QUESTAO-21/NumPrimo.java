//Crie uma função recursiva que verifique se um dado número é primo.

import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informer um numero para verificar se é primo: ");
        int num = sc.nextInt();

        if (primo(num, 2)) {
            System.out.println("É primo.");
        }
        else{
            System.out.println("Nao é primo");
        }

        sc.close();
    }

    public static boolean primo(int num, int divisor){
        if(num <= 1){
            return false;
        }
        if(divisor > Math.sqrt(num)){
            return true;
        }
        if(num % divisor == 0){
            return false;
        }

        return primo(num, divisor + 1);
    }
}
