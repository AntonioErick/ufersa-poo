package Triangulo;

public class Triangulo {
	private double ld1;
	private double ld2;
	private double ld3;
	private String desc;
	
	public void inicializarAtributos(double lado1, double lado2, double lado3, String descricao) {
		ld1 = lado1;
		ld2 = lado2;
		ld3 = lado3;
		desc = descricao;
	}
	
	public double calcularPerimetro() {
		return ld1 + ld2 + ld3;
	}
}
