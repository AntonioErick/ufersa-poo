/*
Escreva um programa que determine quais são todos os números de 3 algarismos cuja
soma dos cubos de seus algarismos sejam iguais ao próprio número.
• Exemplo: 153 = 13 + 53 + 33 = 1 + 125 + 27.
*/

public class SomaDeCubos {
    public static void main(String[] args) {
        
        int c, d, u;
        
        for(int i = 100; i < 1000; i++){
            c = i/100;
            d = (i / 10) % 10;
            u = i % 10;

            if(Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3) == i){
                System.out.println(i);
            }
        } 
    }
}
