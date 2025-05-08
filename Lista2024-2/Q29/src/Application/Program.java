package Application;

import Entities.NumeroComplexo;

/*
Escreva uma classe para representar um número complexo. Essa classe deve conter

três construtores. Um construtor deverá receber os dois valores (parte real e parte imagi-
nária) como argumentos, o outro somente o valor real, considerando o imaginário como

sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e
imaginária do número complexo como sendo iguais a zero. Escreva um método toString
que apresente o número complexo em notação apropriada (ex.: 2 + 4i) e o use em um
aplicativo de teste que demonstre as capacidades da classe criada.
*/

public class Program {

	public static void main(String[] args) {

		NumeroComplexo c1 = new NumeroComplexo();
		NumeroComplexo c2 = new NumeroComplexo(5);
		NumeroComplexo c3 = new NumeroComplexo(3, 4);
		NumeroComplexo c4 = new NumeroComplexo(-2, -7.5);
		
		System.out.println("Número complexo 1: " + c1);
		System.out.println("Número complexo 2: " + c2);
		System.out.println("Número complexo 3: " + c3);
		System.out.println("Número complexo 4: " + c4);
	}

}
