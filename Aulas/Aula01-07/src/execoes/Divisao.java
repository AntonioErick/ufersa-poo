package execoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerador = 0, denominador = 0;
        boolean numeradorCorreto = false;
        boolean denominadorCorreto = false;

        System.out.print("Informe o numerador:");

        do{
            try{
            numerador = sc.nextInt();
            numeradorCorreto = true;
            }
            catch(InputMismatchException e){
            System.out.println("A entrada numerador é invalida");
            sc.nextInt();
            }
        }while(!numeradorCorreto);

        System.out.print("Informe o denominador:");
        do{
            try{
            denominador = sc.nextInt();
            denominadorCorreto = true;
            }
            catch(InputMismatchException e){
            System.out.println("A entrada denominador é invalida");
            sc.nextInt();
            }
        }while(!denominadorCorreto);

        try{
            System.out.println(numerador + "/" + denominador + " = " + divisaoInteira2(numerador, denominador));
        }
        catch(ArithmeticException e){
            System.out.println("Divisao nao foi realizada por zero");
        }

        sc.close();
    }

    public static int divisaoInteira(int numerador, int denominador){
        int resultado;
        try{
            resultado = numerador/denominador;
        }
        catch(ArithmeticException e){
            System.out.println("Divisao por zero nao eh possivel");
        }

        return numerador/denominador;
    }

    public static int divisaoInteira2(int numerador, int denominador) throws ArithmeticException{
        return numerador/denominador;
    }
}
