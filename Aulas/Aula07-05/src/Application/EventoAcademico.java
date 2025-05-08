package Application;

public class EventoAcademico {
    String nomeDoEvento;
    String localDoEvento;
    int numeroDeParticipantes;

    EventoAcademico(String nome, String local, int numParticipantes){
        this.nomeDoEvento = nome;
        this.localDoEvento = (local.isEmpty()? "UFERSA" : local);
        this.numeroDeParticipantes = (numParticipantes<=0? 100 : numParticipantes);
    }

    void mostraEventos(){
        System.out.println("Nome: "+nomeDoEvento);
        System.out.println("Local: "+localDoEvento);
        System.out.println("Participantes: "+numeroDeParticipantes);
    }
}
