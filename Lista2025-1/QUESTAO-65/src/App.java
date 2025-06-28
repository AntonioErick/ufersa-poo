public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f = new Funcionario("Carlos", 2.301);
        Assistente a = new Assistente("Jean", 635.70, 123);
        Tecnico t = new Tecnico("Kaue", 470.80, 123, 200);
        Administrativo adm = new Administrativo("Erick", 760.10, 202311, 140, "noite");

        System.out.println("Funcionário comum:");
        System.out.println(f);
        System.out.println("Ganho anual: R$" + f.ganhoAnual());

        System.out.println("\nAssistente:");
        System.out.println(a);
        System.out.println("Ganho anual: R$" + a.ganhoAnual());

        System.out.println("\nTécnico:");
        System.out.println(t);
        System.out.printf("Ganho anual: R$ %.2f\n", t.ganhoAnual());

        System.out.println("\nAdministrativo:");
        System.out.println(adm);
        System.out.printf("Ganho anual: R$ %.2f\n", adm.ganhoAnual());
    }
}
