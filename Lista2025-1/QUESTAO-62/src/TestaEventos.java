public class TestaEventos {
    public static void main(String[] args) {
        EventoDelegacao evento1 = new EventoDelegacao("Reunião com equipe", 10, 6, 2025, 14, 30);
        EventoHeranca evento2 = new EventoHeranca("Apresentação do projeto", 12, 6, 2025, 9, 0);

        System.out.println("usando delegaçao: ");
        System.out.println(evento1.toString());
        
        System.out.println("usando heranca: ");
        System.out.println(evento2.toString());
    }
}
