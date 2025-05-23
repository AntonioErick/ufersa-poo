package Application;

import java.util.Scanner;
import Entities.Alunos;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome e matricula do aluno, respectivamente: ");
        String name = sc.nextLine();
        int mat = sc.nextInt();

        System.out.println("Informe 3 notas (prova 1, prova 2 e trabalho):");
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double t = sc.nextDouble();

        Alunos a1 = new Alunos(mat, name, p1, p2, t);

        System.out.println(a1.provaFinal());
        sc.close();
    }
}
