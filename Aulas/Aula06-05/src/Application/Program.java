package Application;

import java.util.Scanner;

import Registro.Registro;

//import Triangulo.Triangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		Triangulo t1 = new Triangulo();
		t1.inicializarAtributos(2.3, 3.3, 4.5, "escaleno");
		
		Triangulo t2 = new Triangulo();
		t1.inicializarAtributos(2.3, 3.3, 4.5, "escaleno");
		
		Triangulo t3;
		t3 = t1;
		
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
		*/
		
		//Pratica:
		
		Registro michael = new Registro("michael", "091278364", 2, 60);
		//Registro roberto = new Registro();
		
		double valor = michael.calcularMensalidade();
		System.out.println("Valor da mensalidade de Michael: " + valor);
		
		//double valor2 = roberto.calcularMensalidade();
		//System.out.println("Valor da mensalidade de Michael: " + valor2);
		
		sc.close();
	}

}
