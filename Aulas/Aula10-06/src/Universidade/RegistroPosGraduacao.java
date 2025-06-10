package Universidade;

public class RegistroPosGraduacao {
    private RegistroAcademico registro;
    private String tituloDaTese;
    private String orientador;
    
    public RegistroPosGraduacao(RegistroAcademico registro, String tituloDaTese, String orientador) {
        this.registro = registro;
        this.tituloDaTese = tituloDaTese;
        this.orientador = orientador;
    }

    public RegistroPosGraduacao(String nome, String matricula, String curso, String tituloDaTese, String orientador) {
        this.registro = new RegistroAcademico(nome, matricula, curso);
        this.tituloDaTese = tituloDaTese;
        this.orientador = orientador;
    }

    @Override
    public String toString() {
        return "Registro: " + registro + ", tituloDaTese=" + tituloDaTese + ", orientador=" + orientador;
    }   
}
