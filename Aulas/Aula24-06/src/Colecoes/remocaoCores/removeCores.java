package Colecoes.remocaoCores;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class removeCores {
    public static void main(String[] args) {
        LinkedList<String> listaCores = new LinkedList<>(Arrays.asList("Vermelho", "Azul", "Amarelo", "Cinza", "Rosa", "Verde", "Preto"));
        LinkedList<String> removerCores = new LinkedList<>(Arrays.asList("Amarelo", "Verde"));
        System.out.println(listaCores);
        remove(listaCores, removerCores);
        System.out.println(listaCores);
    }

    public static void remove(LinkedList<String> listaCompleta, LinkedList<String> listaDeRemocao){
        Iterator<String> itera = listaCompleta.iterator(); //retorna um objeto para utilizar a coleçao e usar como quiser
        while (itera.hasNext()) {//verifica se ja chegou no final da lista ou se tem um proximo elemnto
            if(listaDeRemocao.contains(itera.next())){ //next seleciona 
                itera.remove();
            }
        }
    }
}
