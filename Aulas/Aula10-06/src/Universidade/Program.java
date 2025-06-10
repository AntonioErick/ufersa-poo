package Universidade;

public class Program {
    public static void main(String[] args) {
        RegistroAcademico graduando = new RegistroAcademico("Erick", "202301190", "TI");
        RegistroPosGraduacao posGraduando1 = new RegistroPosGraduacao(graduando, "IA nas escolas", "GLaydson");
    
        System.out.println(posGraduando1);

        RegistroPosGraduacao posGraduando2 = new RegistroPosGraduacao("Paulo", "2222", "Egenharia", "absc", "Kennedy");
        System.out.println(posGraduando2);
    }
}
