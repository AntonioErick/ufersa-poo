package Application;

public class Time {
	String nome;
	int jogadores;
	int classificacao;
	String localizacao;
	String ultimoTitulo; 

	Time(String nome, int jogadores, int classificacao, String localizacao, String ultimoTitulo){
		this.nome = nome;
		this.jogadores = jogadores;
		this.classificacao = classificacao;
		this.localizacao = localizacao;
		this.ultimoTitulo = ultimoTitulo;
	}

	void mostrarAtributos(){
		System.out.println("Nome: "+nome);
		System.out.println("Total de jogadores: "+jogadores);
		System.out.println("Classificacao: "+classificacao);
		System.out.println("Localizacao: "+localizacao);
		System.out.println("Ultimo Titulo: "+ultimoTitulo);
	}
}
