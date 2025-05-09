/*
Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. O mdc de
m e n é definido recursivamente como segue:
• se n > m, retorne mdc(n, m);
• se n = 0, retorne m;
• senão, retorne mdc(n, m%n), onde % é o operador de resto da divisão.
*/

import java.util.Scanner;

public class MdcRecursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os 2 valores para calcular o mdc: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = mdc(n, m);

        System.out.println("O mdc de "+n+" e "+m+" é: "+result);

        sc.close();
    }

    public static int mdc(int n, int m){
        if(n > m){
            return mdc(m, n);
        }
        else if(n == 0){
            return m;
        }
        else{
            return mdc(n, m%n);
        }
    }
    
}
