public class Funcionario {
    private String nome;
    private double salarioPorHora;
    private int horasTrabalhadas;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioPorHora = 2.0;
        this.horasTrabalhadas = 220;
    }

    public Funcionario(String nome, double salarioPorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double ganhoTotal(){
        return salarioPorHora * horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", salario por hora: " + salarioPorHora + ", horas trabalhadas: " + horasTrabalhadas;
    }
}
