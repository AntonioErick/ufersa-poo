import java.util.ArrayList;

public class Produto {
    private ArrayList<Integer> inteiros;

    public Produto(){
        inteiros = new ArrayList<>();
    }

    public void addNum(int... num){
        for(int n : num){
            inteiros.add(n);
        }
    }

    public int calcularProduto(){
        int prod = 1;
        for(int n : inteiros){
            prod *= n;
        }
        return prod;
    }
}
