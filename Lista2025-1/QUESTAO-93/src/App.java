import java.util.Arrays;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> caracteres = new LinkedList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j"));
       
        System.out.println("Lista original: " + caracteres);

        LinkedList<String> caracteresInverso = new LinkedList<>();
        for(int i = caracteres.size() - 1; i >= 0; i--){
            caracteresInverso.add(caracteres.get(i));
        }

        System.out.println("Lista invertida: " + caracteresInverso);
    }
}
