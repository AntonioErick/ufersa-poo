package Colecoes.mapa;

import java.util.TreeMap;

public class ContaPalavras {
    public static void main(String[] args) {
        String texto = "Lorem ipsum dolor sit amet consectetur adipiscing elit Cras consequat libero sit amet mi aliquam sollicitudin Nulla libero lectus laoreet congue pulvinar at pharetra ut lorem Integer sed leo ut urna finibus porttitor Nulla ornare ac ex ac consectetur Sed porta turpis id iaculis aliquam ex massa consectetur elit eu tristique ex eros dapibus eros Etiam rhoncus enim et tellus commodo lobortis pulvinar eget nisl Class aptent taciti sociosqu ad litora torquent per conubia nostra per inceptos himenaeos Sed cursus a lorem nec feugiat";
        
        TreeMap<String, Integer> mapa = new TreeMap<>();
        String palavras[] = texto.split(" ");

        for(String palavra : palavras){
            String palavraMin = palavra.toLowerCase();
            if(mapa.containsKey(palavraMin)){
                int qtd = mapa.get(palavraMin);
                mapa.put(palavraMin, qtd+1);
            }
            else{
                mapa.put(palavraMin, 1);
            }
        }

        for(String palavra : mapa.keySet()){
            System.out.println(palavra + " " + mapa.get(palavra));
        }
    }
}
