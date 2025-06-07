package ArrayList;

import java.util.ArrayList;

public class Extrato {
    private float saldoFinal;
    private ArrayList<Float> transacoes;


    public Extrato() {
        this.saldoFinal = 0;
        transacoes = new ArrayList<>();
    }

    public void transacao(float valor){
        if (saldoFinal+valor>=0) {
            saldoFinal += valor;
            transacoes.add(valor);
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
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
