package Colecoes.pilha;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<Number> pilha = new Stack<>(); //cria uma pilha do tipo numerico
        System.out.println(pilha);
        pilha.push(4);
        System.out.println(pilha);
        pilha.push(3.435345);
        System.out.println(pilha);
        pilha.push(1.23F);
        System.out.println(pilha);

        while(!pilha.isEmpty()) {
            System.out.println("Removido: " + pilha.pop());
            System.out.println(pilha);
        }
    }
}
