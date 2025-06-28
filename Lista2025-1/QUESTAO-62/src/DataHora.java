public class DataHora {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;
    
    public DataHora(int dia, int mes, int ano, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public String toString() {
        return String.format("%d/%d/%d ás %02d:%02d", dia, mes, ano, hora, minuto);
    }
}
