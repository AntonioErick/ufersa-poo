public class Equipamento {
    private String processador;
    private String memoriaRam;

    public Equipamento(String processador, String memoriaRam){
        this.memoriaRam = memoriaRam;
        this.processador = processador;
    }

    public String getProcessador(){
        return processador;
    }

    public String getMemoriaRam(){
        return memoriaRam;
    }

    public void setProcessador(String processador){
        this.processador = processador;
    }

    public void setMemoriaRam(String memoriaRam){
        this.memoriaRam = memoriaRam;
    }

    public String toString(){
        return "Processador: " + processador + ", Memória Ram: " + memoriaRam;
    }
}
