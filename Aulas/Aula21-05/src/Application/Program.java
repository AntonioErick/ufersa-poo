package Application;

import Natal.Data;
import Conversor.Unidades;

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
    }
}
