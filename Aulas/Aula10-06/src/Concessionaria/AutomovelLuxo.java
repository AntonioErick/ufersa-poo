package Concessionaria;

public class AutomovelLuxo extends AutomovelBasico{
    protected boolean direçaoHidraulica;
    protected boolean arCondicionado;

    public AutomovelLuxo(boolean airBag, boolean radio, boolean direçaoHidraulica, boolean arCondicionado) {
        super(airBag, radio);
        this.direçaoHidraulica = direçaoHidraulica;
        this.arCondicionado = arCondicionado;
    }

    public AutomovelLuxo(String modelo, String cor, int ano, boolean airBag, boolean radio, boolean direçaoHidraulica,
            boolean arCondicionado) {
        super(modelo, cor, ano, airBag, radio);
        this.direçaoHidraulica = direçaoHidraulica;
        this.arCondicionado = arCondicionado;
    }

    public float quantoCusta(){
        float custo = super.quantoCusta();
        if(arCondicionado) custo += 10000;
        if(direçaoHidraulica) custo += 15000;

        return custo;
    }

    @Override
    public String toString(){
        String res = "Modelo: "+getModelo();
        res += " Cor: " +getCor();
        res += " Ano: "+getAno();
        res += " AirBag: "+(airBag ? "Sim" : "Nao");
        res += " Radio: "+(radio ? "Sim" : "Nao");
        res += " Ar Condicionado: "+arCondicionado+ ", Direçao Hidraulica: "+direçaoHidraulica + " Quanto custa: "+quantoCusta();
        return res;
    }
}
