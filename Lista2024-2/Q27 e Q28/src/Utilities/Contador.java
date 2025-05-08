package Utilities;

/*
Escreva a classe Contador que encapsule um valor usado para contagem de eventos.
Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo

com que o acesso ao valor seja feito através de métodos que devem zerar, incremen-
tar e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as

capacidades da classe criada.
*/

public class Contador {

	private int counter;
	
	public Contador(int counter) {
		this.counter = counter;
	}
	
	public void showCounter() {
		System.out.println("Contador: "+counter);;
	}
	
	public int incrementCounter() {
		return counter++;
	}
	
	public void resetCounter() {
		counter = 0;
	}
}
