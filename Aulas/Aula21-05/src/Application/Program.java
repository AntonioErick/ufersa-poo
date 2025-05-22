package Application;

import Natal.Data;
import Conversor.Unidades;
import Igualdade.ehIgual;
import Tupla.Tupla;

public class Program {
    public static void main(String[] args) {
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Demonstraçao de metodos estaticos: ");

        //metodo static nao necessita de instanciar a classe
        System.out.println("5 polegadas = "+Unidades.polegadasParaCentimetros(5));
        System.out.println("5 Pes = "+Unidades.pesParaCentimetros(5));
        System.out.println("5 Milhas = "+Unidades.milhasParaQuilometros(5));

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Demonstraçao de fabrica de instancias: ");

        Data n2023 = Data.natal(2023);
        Data n2024 = Data.natal(2024);
        Data n2025 = Data.natal(2025);

        n2023.mostraData();
        n2024.mostraData();
        n2025.mostraData();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Demonstraçao de metodos genericos: ");

        Double c1 = 5.0;
        Double c2 = 5.0;

        System.out.println("c1 == c2 ? "+ (ehIgual.Igual(c1, c2) ? "Sim" : "Nao"));

        Integer d1 = 4;
        Integer d2 = 5;

        System.out.println("d1 == d2 ? "+ (ehIgual.Igual(d1, d2) ? "Sim" : "Nao"));

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Demonstraçao de classes genericas: ");

        Tupla<String, Double> t1 = new Tupla<String,Double>("Ufersa", 1.2345);
        Tupla<String, Integer> t2 = new Tupla<String,Integer>("Erick", 5);
        System.out.println(t1);
        System.out.println(t2);

        System.out.println("-----------------------------------------------------------------");
    }
}
