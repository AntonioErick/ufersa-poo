package Application;

import Luz.Lampada;;

public class Program {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.mostrarEstado();
        l1.ligar();
        l1.mostrarEstado();
        l1.apaga();
        l1.mostrarEstado();
        l1.vezesLigada();
    }
}
