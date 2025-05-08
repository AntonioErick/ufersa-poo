package Application;

import java.util.Locale;
import java.util.Scanner;

public class Funcao {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double n1, n2, n3;
		
		System.out.println("Informe 3 valores: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		double media = metodo(n1, n2, n3);
		
		System.out.println("A média dos valores informados é: "+media);
		
		sc.close();
	}
	
	public static double metodo(double n1, double n2, double n3) {
		return (n1 + n2 +3)/3;
	}
}
