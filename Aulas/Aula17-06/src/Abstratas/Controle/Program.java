package Abstratas.Controle;

public class Program {
    public static void main(String[] args) {
        Carro c = new Carro(5, 4, "0978438");
        Barco b = new Barco(20, 50.5F, "0943ru98jh");
        Aviao a = new Aviao(72, "ADSDVDFV", "AirBoing");

        Controle controle = new Controle();

        controle.controlar(a);
        controle.controlar(b);
        controle.controlar(c);
    }
}
