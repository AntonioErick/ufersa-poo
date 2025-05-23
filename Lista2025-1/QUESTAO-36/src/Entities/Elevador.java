package Entities;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int andarAtual, int totalAndares, int capacidade, int pessoasPresentes){
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = pessoasPresentes;
    }

    public void entrar(){
        if(pessoasPresentes < capacidade) pessoasPresentes++;
        else System.out.println("Elevador já atingiu a capacidade máxima.");
    }

    public void sair(){
        if(pessoasPresentes > 0) pessoasPresentes--;
        else System.out.println("Elevador está vazio.");
    }

    public void subir(){
        if(andarAtual < totalAndares) andarAtual++;
        else System.out.println("Elevador já está no topo.");
    }

    public void descer(){
        if(andarAtual <= 0) System.out.println("Elevador já está no terreo."); 
        else andarAtual--;
    }

    public String toString(){
        return "Andar atual: "+andarAtual+
               "\nPessoas no elevador: "+pessoasPresentes;
    }
}
