package Entities;

public class Alunos {
    private int mat;
    private String nome;
    private Double p1, p2, t;

    public Alunos(int mat, String nome, Double p1, Double p2, Double t){
        this.mat = mat;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    public double media(double p1, double p2, double t){
        return (2.5*p1 + 2.5*p2 + 2*t)/7;
    }

    public String provaFinal(){
        double mp = media(p1, p2, t);

        if(mp < 3 || mp >=7){
            return String.format("%.2f", mp) + "Aprovado por media";
        }
        else{
            double mf = mp/10;
            if(mf >= 5){
                return String.format("%.2f", mf) +" Aprovado";
            }
            else return String.format("%.2f", mf) + " Reprovado";
        }
    }
}
