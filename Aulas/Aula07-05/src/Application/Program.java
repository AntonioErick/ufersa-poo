package Application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        EventoAcademico evento = new EventoAcademico("King Kong Box", "Savana", 100);

        evento.mostraEventos();

        sc.close();
    }    
}