public class Administrativo extends Assistente{
    private double bonusSalarial;
    private String turno;

    public Administrativo(String nome, double salario, int matricula, double bonusSalarial, String turno) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
        this.turno = turno;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public String getTurno() {
        return turno;
    }
    
    public double ganhoAnual(){
        double salarioAnual = super.ganhoAnual();
        if(bonusSalarial > 0 && turno.toLowerCase() == "turno"){
            return salarioAnual + bonusSalarial;
        }
        else{
            return salarioAnual;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", turno: " + turno + ", bonusSalarial: " + bonusSalarial;
    }
}
