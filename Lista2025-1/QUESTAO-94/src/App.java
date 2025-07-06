import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        String texto = "HELLO THERE";

        texto = texto.toUpperCase().replaceAll("\\s", "");

        Map<Character, Integer> mapa = new TreeMap<>();

        for(char c : texto.toCharArray()){
            if (Character.isLetter(c)) {
                mapa.put(c, mapa.getOrDefault(c, 0) + 1);
            }
        }

        for(Character palavra : mapa.keySet()){
            System.out.println(palavra + " " + mapa.get(palavra));
        }
    }
}
