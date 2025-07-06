public class Paciente {
    private String nome;
    private int idade;
    private int rg;

    public Paciente(int idade, int rg) {
        this.idade = idade;
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "| Idade: " + idade + " | RG: " + rg + " |";
    }
}
