package Abstratas.Controle;

public abstract class Terrestre extends Veiculo{
    private int qtdRodas;

    public Terrestre(int capaciade, int qtdRodas) {
        super(capaciade);
        this.qtdRodas = qtdRodas;
    }

    @Override
    public String toString() {
        return super.toString() + ", quantidade de rodas: " + qtdRodas;
    }
}
