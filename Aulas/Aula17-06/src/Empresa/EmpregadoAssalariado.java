package Empresa;

public class EmpregadoAssalariado extends Empregado{
    private float salario;

    public EmpregadoAssalariado(String nome, String ctps, float salario) {
        super(nome, ctps);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", salario: " + salario;
    }

    public float obterPagamento(){
        return salario;
    }
}
