package Entities;

public class NumeroComplexo {

	private double numeroReal;
	private  double numeroImaginario;
	
	public NumeroComplexo() {
		this.numeroImaginario = 0;
		this.numeroReal = 0;
	}
	
	public NumeroComplexo(double numeroReal, double numeroImaginario) {
		this.numeroImaginario = numeroImaginario;
		this.numeroReal = numeroReal;
	}
	
	public NumeroComplexo(double numeroReal) {
		this.numeroImaginario = 0;
		this.numeroReal = numeroReal;
	}
	
	public String toString() {
		return numeroReal+(numeroImaginario >= 0 ? " + " : " - ")+ Math.abs(numeroImaginario)+"i";
	}
}
