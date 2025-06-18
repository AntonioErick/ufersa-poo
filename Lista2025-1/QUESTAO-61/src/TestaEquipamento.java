public class TestaEquipamento {
    public static void main(String[] args) throws Exception {
        Computador c = new Computador("Hizen 9", "16 gb", "Nitro 5", 2025);
        Equipamento e = new Equipamento("Intel core 5i", "6 gb");

        System.out.println(c);
        System.out.println(e);
    }
}
