package Empresa;

public class Program {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Erick", "2003324");
        Funcionario funcionario = new Funcionario("Jean", "9092798", 2.50F); //F representa o float
        ChefeDepartamento chefe = new ChefeDepartamento("Kaue", "0294378", 1.50F, "TI");
   
        System.out.println(pessoa);
        System.out.println(funcionario);
        System.out.println(chefe);
    }
}
