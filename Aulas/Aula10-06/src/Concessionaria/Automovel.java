package Concessionaria;

public class Automovel {
    protected String modelo;
    protected String cor;
    protected int ano;

    public Automovel(){
    }

    public Automovel(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    
    public float quantoCusta(){
        return (ano < 2010 ? 50000 : 70000);
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }
}
