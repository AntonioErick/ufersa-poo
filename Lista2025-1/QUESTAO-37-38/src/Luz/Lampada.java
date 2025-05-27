package Luz;

import Contador.Contador;

public class Lampada {
    private boolean lampada;
    private Contador contador;

    public Lampada(){
        this.lampada = false;
        contador = new Contador();
    }

    public void ligar(){
        if(!lampada){
            lampada = true;
            contador.incrementar();
        }
    }

    public void apaga(){
        lampada = false;
    }

    public void mostrarEstado(){
        if (lampada) {
            System.err.println("Ligado");
        }
        else System.out.println("Desligada");
    }

    public void vezesLigada(){
        System.out.println("Foi ligada "+contador.mostrar()+" vezes.");
    }
}
