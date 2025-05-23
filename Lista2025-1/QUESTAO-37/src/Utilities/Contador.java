package Utilities;

public class Contador {
    private static int cont = 0;

    public static void zerar(){
        cont = 0;
    }

    public static void incrementar(){
        cont++;
    }

    public static int mostrarContador(){
        return cont;
    }
}
