package Empresa;

public class Pessoa {
    protected String nome;
    protected String identidade;

    public Pessoa(){
    }
    
    public Pessoa(String nome, String identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    @Override 
    public String toString() {
        return "Nome: " + nome + ", identidade: " + identidade;
    }
    
}
