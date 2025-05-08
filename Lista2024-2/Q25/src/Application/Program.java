package Application;

/*
 Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
nome, 2 notas de prova (P1 e P2) e 1 nota de trabalho (T). Escreva os seguintes métodos
para esta classe:
• media: calcula a média parcial do aluno (MP)
– cada prova tem peso 2, 5 e o trabalho tem peso 2 (MP =

2,5×P1+2,5×P2+2×T
7
)

• provaF inal: calcula quanto o aluno precisa para o exame final (EF)
– retorna zero se o aluno não necessita realizar o exame final (MP < 3 ou MP >=
7)
– média final MF = (MP × 6 + EF × 4)/10
– é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado
após realizar o exame final
 */

import java.util.Locale;
import java.util.Scanner;

import Utilities.Grade;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe o nome do aluno: ");
		String name = sc.nextLine();
		
		System.out.print("Informe a matricula: ");
		int mat = sc.nextInt();

		System.out.print("Informe a nota da 1º prova: ");
		double p1 = sc.nextDouble();

		System.out.print("Informe a nota da 2º prova: ");
		double p2 = sc.nextDouble();
		
		System.out.print("Informe a nota do trabalho: ");
		double t = sc.nextDouble();
		
		Grade grade = new Grade(mat, name, p1, p2, t);
		
		System.out.println("---------------------------------------------------------");
		
		double mediaParcial = grade.media(p1, p2, t);
		
		if(mediaParcial < 3 || mediaParcial >= 7) {
			System.out.println("APROVADO");;
			System.out.println("Media: "+ mediaParcial);
		}
		else {
			System.out.print("Informe a nota do exame final: ");
			double EF = sc.nextDouble();
			
			double mediaFinal = grade.provaFinal(mediaParcial, EF);
			
			if(mediaFinal >= 5) {
				System.out.println("APROVADO");
				System.out.printf("Media final: %.2f\n", mediaFinal);
			}
			else {
				System.out.println("REPROVADO");
				System.out.printf("Media final: %.2f\n", mediaFinal);
			}
		}
		
		System.out.println("---------------------------------------------------------");
		
		sc.close();
	}

}
