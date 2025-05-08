/*
Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito
é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos:
6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14.
*/

public class NumPerfeito {
    public static void main(String[] args) {

        int num = 2;
        int numCount = 0;

        System.out.println("Os quatro primeiros numeros perfeitos:");

        while(numCount < 4){

            int divisao = 0;

            for(int i = 1; i < num; i++){
                if(num % i == 0){
                    divisao += i;
                }
            }

            if(divisao == num){
                System.out.println(num);
                numCount++;
            }

            num++;
        
        }
    }
}
