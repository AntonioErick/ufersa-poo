package Contador;

public class Contador {
    private static int cont = 0;

    public void zerar(){
        cont = 0;
    }

    public void incrementar(){
        cont++;
    }

    public int mostrar(){
        return cont;
    }
}
