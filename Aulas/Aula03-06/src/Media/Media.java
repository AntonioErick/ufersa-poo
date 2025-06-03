package Media;

public class Media {
    public static void main(String[] args) {
        double media2 = media(2.5,3.5);
        System.out.println("Media de dois elementos: "+media2);

        double media3 = media(2.5,3.5, 4.5);
        System.out.println("Media de tres elementos: "+media3);
    }

    public static double media(double... num){ //... indica varios numeros armazenados em um array
        double soma = 0;
        for(double d : num){
            soma += d;
        }
        return soma/num.length;
    }
}
