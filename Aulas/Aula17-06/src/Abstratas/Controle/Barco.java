package Abstratas.Controle;

public class Barco extends Aquatico{
    private String cadBarco;

    public Barco(int capaciade, float profundidade, String cadBarco) {
        super(capaciade, profundidade);
        this.cadBarco = cadBarco;
    }

    @Override
    public void moverFrente(){
        System.out.println("Barco esta movendo para frente");
    }

    @Override
    public String toString() {
        return super.toString() + ", cadBarco: " + cadBarco;
    }   
}
