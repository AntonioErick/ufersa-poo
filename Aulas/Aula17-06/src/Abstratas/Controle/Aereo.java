package Abstratas.Controle;

public abstract class Aereo extends Veiculo{
    private String cadANAC;

    public Aereo(int capaciade, String cadANAC) {
        super(capaciade);
        this.cadANAC = cadANAC;
    }

    @Override
    public String toString() {
        return super.toString() + ", cadANAC: " + cadANAC;
    }
}
