/*
Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A
cidade A tem um crescimento populacional de 3, 5% ao ano, enquanto a população da
cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quanti-
dade de anos necessária para que a população da cidade A seja maior ou igual a popu-
lação da cidade B.
 */

public class Populacao {
    public static void main(String[] args) {

        int cB = 20000, cA = 7000, anos = 0;

        for(int i = 0; cA < cB; i++){
            cA += cA * 0.035;
            cB += cB * 0.01;
            anos = i;
        }

        System.out.println("A cidade A vai ser maior que a ciadade B em "+anos+" anos");
    }
}
