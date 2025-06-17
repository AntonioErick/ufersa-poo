package Abstratas.Controle;

public abstract class Veiculo {
    private int capaciade;

    public Veiculo(int capaciade) {
        this.capaciade = capaciade;
    }

    public abstract void moverFrente(); //metodo abtstrato n tem implementaçao

    @Override
    public String toString() {
        return "Capaciade: " + capaciade;
    }
}
