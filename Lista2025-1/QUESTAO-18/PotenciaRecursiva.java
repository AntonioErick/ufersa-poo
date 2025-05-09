/*
Crie uma função recursiva potencia(base,expoente) que, quando chamada, retorna baseexpoente.
Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas
81 nesse exemplo)
Assuma que expoente é um inteiro maior ou igual a 1.
*/

import java.util.Scanner;

public class PotenciaRecursiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a base a potencia, respectivamente: ");
        int base = sc.nextInt();
        int expoente = sc.nextInt();

        int resultado = potencia(base, expoente);

        System.out.println(resultado);

        sc.close();
    }

    public static int potencia(int base, int expoente){
        if (expoente == 1) {
            return base;
        }

        return base * potencia(base, expoente - 1);
    }
}
