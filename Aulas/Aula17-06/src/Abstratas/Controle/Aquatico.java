package Abstratas.Controle;

public abstract class Aquatico extends Veiculo{
    private float profundidade;

    public Aquatico(int capaciade, float profundidade) {
        super(capaciade);
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", profundidade: " + profundidade;
    }
}
