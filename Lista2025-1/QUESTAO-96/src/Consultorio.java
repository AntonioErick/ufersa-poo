import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Consultorio {
    public static void main(String[] args) throws Exception {
        Queue<Paciente> filaComum = new LinkedList<>();
        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Random rand = new Random();

        int pacientesAtendidos = 0;
        int tempo = 0;
        int tempoConsultaRestante = 0;

        while (pacientesAtendidos < 20) {
            if(tempo % 4 == 0){
                int rg = 10000000 + rand.nextInt(90000000);
                int idade = 10 + rand.nextInt(80);

                Paciente p1 = new Paciente(idade, rg);

                if(idade > 60){
                    filaPrioritaria.add(p1);
                    System.out.println("["+tempo+"] Chegou (PRIORITARIO): " + p1);
                }
                else {
                    filaComum.add(p1);
                    System.out.println("[" + tempo + " min] Chegou (COMUM): " + p1);
                }
            }

            if(tempoConsultaRestante == 0 && pacientesAtendidos < 20){
                Paciente proximo = null;

                if(!filaPrioritaria.isEmpty()){
                    proximo = filaPrioritaria.poll();
                }
                else if(!filaComum.isEmpty()){
                    proximo = filaComum.poll();
                }

                if(proximo != null){
                    tempoConsultaRestante = 5;
                    pacientesAtendidos++;
                    System.out.println("[" + tempo + " min] Atendimento iniciado: " + proximo);
                }
            }

            if(tempoConsultaRestante > 0){
                tempoConsultaRestante--;
                if(tempoConsultaRestante == 0){
                    System.out.println("[" + tempo + " min] Atendimento finalizado." );
                }
            }

            tempo++;
        }
        System.out.println("\nAtendimento finalizado após " + tempo + " minutos.");
    }
}
