package Colecoes.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BuscaCor {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Vermelho");
        assert cores.add("Vermelho");
        cores.addAll(Arrays.asList("Laranja", "Verde", "Rosa", "Azul", "Amarelo")); //nao ordenada
        System.out.println(cores);
        Collections.sort(cores); //ordena
        System.out.println(cores);
        buscaString(cores, "Cinza");
        buscaString(cores, "Laranja");
        buscaString(cores, "Verde");
    }

    public static void buscaString(ArrayList<String> arrayList, String alvo){
        if(arrayList.contains(alvo)){ //verifica se contem o objeto na lista
            int posicao = Collections.binarySearch(arrayList, alvo); //indica qual posicao a string esta na arraylist
            System.out.println(alvo + " esta na posicao " + posicao + " da lista.");
        }
        else{
            System.out.println(alvo + " nao esta na lista.");
        }
    }
}
