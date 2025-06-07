public class Program {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        EntradaEmAgenda c1 = new EntradaEmAgenda(10, 7, 6, 2025, "Cafe");
        EntradaEmAgenda c2 = new EntradaEmAgenda(15, 7, 6, 2025, "reuniao");

        agenda.adicionarCompromisso(c1);
        agenda.adicionarCompromisso(c2);

        agenda.listaDia(10, 6, 2025);
        agenda.listaDia(17, 6, 2025);
    }
}
