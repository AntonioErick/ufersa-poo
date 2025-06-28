public class EventoDelegacao {
    private DataHora dataHora;
    private String descricao;

    public EventoDelegacao(String descricao, int dia, int mes, int ano, int hora, int minuto) {
        this.dataHora = new DataHora(dia, mes, ano, hora, minuto);
        this.descricao = descricao;
    }

    public DataHora getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return "Evento: " + descricao + ", Data e Hora: " + dataHora;
    }
}
