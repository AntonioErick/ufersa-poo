package Colecoes.fila;

import java.util.PriorityQueue;

public class Fila {
    public static void main(String[] args) {
        PriorityQueue<Double> filaComPrioridade = new PriorityQueue<>(); //inicia a fila de prioridade vazia
        filaComPrioridade.offer(3.5);
        filaComPrioridade.offer(9.5);
        filaComPrioridade.offer(5.5);
        filaComPrioridade.offer(4.5);
        filaComPrioridade.offer(8.5);
        filaComPrioridade.offer(7.5);
        filaComPrioridade.offer(6.5);

        while (!filaComPrioridade.isEmpty()) {
            System.out.println( filaComPrioridade.poll());  
            //le o elemento de cima em ordem por ser do tipo PriorityQueue
        }
    }
}
