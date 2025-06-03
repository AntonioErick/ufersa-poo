package DemoDama;

import Dama.Tabuleiro;

public class Arrays {
    public static void main(String[] args) {
        //Unidimensionais
        /*
        System.err.println("Multidimensionais");
        double termosDaSerie[] = new double[100000];

        for(int i = 0; i < termosDaSerie.length; i++){
            termosDaSerie[i] = 1/Math.pow(i + 1, 2);
        }

        for(int num = 10; num <= 100000; num*=10){
            calculaEMostraSomatorio(termosDaSerie, num);
        }
        */

        //Multidimensionais
        System.err.println("Multidimensionais");
        Tabuleiro tab = new Tabuleiro();
        System.out.println(tab);
        
    }

    //Unidimensionais
    public static void calculaEMostraSomatorio(double array[], int num){
        double soma = 0.0;
        for(int i =0; i < num; i++){
            soma += array[i];
        }
        System.out.println("A soma dos primeiros numeros é: "+soma);
    }
}
