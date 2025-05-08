import java.util.Scanner;

/*
 Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma
que n > 0.
*/

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor para calcular o fibonacci: ");
        int n = sc.nextInt();

        int resultado = fibonacci(n);

        System.out.println(resultado);

        sc.close();
    }

    public static int fibonacci(int n){
        if(n == 1){
            return 1;
        }
        
        if(n == 0){
            return 0;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
