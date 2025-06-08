public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto();
        produto1.addNum(2,2,2);
        
        Produto produto2 = new Produto();
        produto2.addNum(1,3,5);

        Produto produto3 = new Produto();
        produto3.addNum(4,8);

        System.out.println("Produto 1: "+ produto1.calcularProduto());
        System.out.println("Produto 2: "+ produto2.calcularProduto());
        System.out.println("Produto 3: "+ produto3.calcularProduto());
    }
}
