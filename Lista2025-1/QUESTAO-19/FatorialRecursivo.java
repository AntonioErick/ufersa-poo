/*
Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recur-
siva, exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação).
Faça o melhor que você puder para tornar a saída limpa, interessante e significativa. Seu
objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento
da recursão.

Por exemplo, para uma entrada n = 5, o programa deve exibir:
0! = 1
    1! = 1
        2! = 2
            3! = 6
                4! = 24
                    5! = 120
*/

import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor para caluclar o fatorial: ");
        int fat = sc.nextInt();

        fatorial(fat);

        sc.close();
    }

    public static int fatorial(int fat){
        if(fat == 0){
            return 1;
        }

        int resultado = fat * fatorial( fat - 1);

        System.out.println(fat+"! = "+resultado);
        
        for(int i = 0; i < fat; i++){
            System.out.print("\t");
        }

        return resultado;
    }
}
