package Concessionaria;

public class Program {
    public static void main(String[] args) {
        AutomovelLuxo automovelLuxo = new AutomovelLuxo("Ferrari", "Vermelho", 2023, true, true, true, true);
        System.out.println(automovelLuxo);
        System.out.println("Custo: "+automovelLuxo.quantoCusta());
    }
}
