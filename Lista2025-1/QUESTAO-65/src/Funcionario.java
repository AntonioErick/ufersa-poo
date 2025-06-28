public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double aumento){
        salario += aumento;
    }

    public double ganhoAnual(){
        return salario * 12 + salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        return "Nome:" + nome + ", salario: R$ " + String.format("%.2f", salario);
    }
}
