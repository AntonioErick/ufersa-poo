public class Tecnico extends Assistente{
    protected double bonusSalarial;

    public Tecnico(String nome, double salario, int matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }
    
    public double ganhoAnual(){
        double salarioAnual = super.ganhoAnual();
        if(bonusSalarial > 0){
            return salarioAnual + bonusSalarial;
        }
        else return salarioAnual;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    @Override
    public String toString() {
        return super.toString() + ", bonusSalarial: " + bonusSalarial;
    }
}
