public class EventoHeranca extends DataHora{
    private String descricao;

    public EventoHeranca(String descricao, int dia, int mes, int ano, int hora, int minuto) {
        super(dia, mes, ano, hora, minuto);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return "Evento: " + descricao + ", Data e Hora: " + super.toString();
    }
}
