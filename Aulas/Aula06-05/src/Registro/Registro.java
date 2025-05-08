package Registro;

public class Registro {
	private String nome;
	private String matricula;
	private double codigoCurso;
	private double percentualDeCobranaca;
	
	public Registro(String nome, String matricula, int codigoCurso, int percentualDeCobranaca) {
		this.nome = nome;
		this.matricula = matricula;
		this.codigoCurso = codigoCurso;
		this.percentualDeCobranaca = percentualDeCobranaca;
	}

	public double calcularMensalidade() {
		return 100.0*codigoCurso*(percentualDeCobranaca/100);
	}
}
