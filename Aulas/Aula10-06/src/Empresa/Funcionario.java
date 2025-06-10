package Empresa;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String nome, String identidade, float salario) {
        super(nome, identidade);
        this.salario = salario;
    }

    public float getSalario(){
        return salario;
    }

    public String toString(){
        return "Nome: " + getNome() + ", Identidade: " + getIdentidade() + ", Salario: " + salario;
    }
}
