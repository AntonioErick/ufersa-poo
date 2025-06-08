public class Cliente {
    private String nome;
    private int id;
    private int idade;
    private int telefone;

    public Cliente(String nome, int id, int idade, int telefone) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "[Nome: " + nome + "\tID: " + id + "\tIdade: " + idade + "\tTelefone: " + telefone + "]\n";
    }
}
