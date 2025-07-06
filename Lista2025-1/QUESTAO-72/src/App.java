public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("Erick");
        Funcionario f2 = new Funcionario("Sebastiao", 5.50, 540);

        System.out.println(f1);
        System.out.println("Salario por hora de " + f1.getNome() + ": R$ "+ String.format("%.2f", f1.ganhoTotal()));
        System.out.println(f2);
        System.out.println("Salario por hora de " + f2.getNome() + ": R$  "+ String.format("%.2f", f2.ganhoTotal()));
    }
}
