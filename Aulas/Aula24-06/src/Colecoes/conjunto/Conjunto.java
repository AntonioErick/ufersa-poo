package Colecoes.conjunto;

import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        TreeSet<String> conjunto = new TreeSet<>(); //cria o conjunto(TreeSet) vazio
        conjunto.add("Preto");
        System.out.println(conjunto);
        conjunto.add("Azul");
        System.out.println(conjunto);
        conjunto.add("Laranja");
        System.out.println(conjunto);
        conjunto.add("Cinza");
        System.out.println(conjunto);
        conjunto.add("Rosa");
        System.out.println(conjunto);
        conjunto.add("Verde");
        System.out.println(conjunto);
        conjunto.add("Vermelho");
        System.out.println(conjunto);
        conjunto.add("Preto"); 
        //nao conseguimos adiconar o msm elemento mais de uma vez em um conjunto
        //Ja adiciona na posicao correta
        System.out.println(conjunto);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Antes: " + conjunto.headSet("Preto"));
        System.out.println("A partir: " + conjunto.tailSet("Preto"));
        System.out.println("Primeirto: " + conjunto.first());
        System.out.println("Ultimo: " + conjunto.last());
    }
}
