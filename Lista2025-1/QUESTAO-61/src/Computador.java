public class Computador extends Equipamento{
    private String marca;
    private int ano;

    public Computador(String processador, String memoriaRam, String marca, int ano){
        super(processador, memoriaRam);
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString(){
        return super.toString() + ", Marca: " + marca + ", Ano: " + ano;
    }
}
