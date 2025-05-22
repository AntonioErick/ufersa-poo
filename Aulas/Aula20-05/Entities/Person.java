package Entities;

public class Person {
    private String nome;
    private double altura;

    public Person(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome(){
        return "Nome: "+nome;
    }

    public void setNome(String nome){
        if(!nome.isEmpty()) this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", altura=" + altura;
    }
}
