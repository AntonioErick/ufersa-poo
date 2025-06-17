package Abstratas.Controle;

public class Aviao extends Aereo{
    private String cadAviao;
    
    public Aviao(int capacidade, String cadANAC, String cadAviao) {
        super(capacidade, cadANAC);
        this.cadAviao = cadAviao;
    }

    @Override
    public void moverFrente(){
        System.out.println("Aviao esta movendo para frente");
    }

    @Override
    public String toString() {
        return super.toString() + ", cadAviao: " + cadAviao;
    }    
}
