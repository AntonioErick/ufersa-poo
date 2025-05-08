package Application;

/*
 Escreva uma classe para representar um time de um esporte qualquer em um campeo-
nato desse esporte. Que atributos devem ser representados nessa classe? Quais méto-
dos ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da
classe criada. 
 */

public class Program {
	public static void main(String[] args) {
		
		Time time1 = new Time("KingsKong", 100, 5, "Savana", "2025");

		time1.mostrarAtributos();
	}
}
