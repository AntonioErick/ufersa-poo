import java.text.DecimalFormat;
import java.util.Random;

/*
Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
(somente com os números, respeitando o número de linhas e a distribuição dos números
nas linhas).
 */

public class MegaSena {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("00");
        Random rand = new Random();

        int cont = 1;
        int num;

        System.out.println("----------------------------------------");
        System.out.println("                MEGA SENA");
        System.out.println("----------------------------------------");

        for(int i = 1; i <= 60; i++){
            num = rand.nextInt(60) + 1;
            System.out.print("|"+df.format(num)+"|");
            cont ++;

            if(cont == 11){
                System.out.print("\t\n");
                cont = 1;
            }
        }

        /* 
        int[][] mat = new int[10][6];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 6; j++){
                num = rand.nextInt(60) + 1;
                mat[i][j] = num;
            }
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        */

        System.out.println("----------------------------------------");
    }
}
