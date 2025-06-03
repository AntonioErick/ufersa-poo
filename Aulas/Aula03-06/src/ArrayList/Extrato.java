package ArrayList;

import java.util.ArrayList;

public class Extrato {
    private float saldoFinal;
    private ArrayList<Float> transacoes;


    public Extrato() {
        this.saldoFinal = 0;
        transacoes = new ArrayList<>();
    }

    public String toString(){
        String res = "--------------------\n";
        for(Float f : transacoes){
            res += f + "\n";
        }
        res += "Saldo: "+saldoFinal+"\n";
        res += "--------------------\n";
        return res;
    }
}
