public class EntradaEmAgenda {
    private int dia;
    private int hora;
    private int mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(int dia, int hora, int mes, int ano, String assunto) {
        this.dia = dia;
        this.hora = hora;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return String.format("Compromisso: %s às %d horas do dia %d/%d/%d", assunto, hora, dia, mes, ano);
    }
    
    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }
}
