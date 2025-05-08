package Utilities;

public class Grade {

	private int mat;
	private String name;
	private double P1, P2, T;
	
	public Grade(int mat, String name, double p1, double p2, double t) {
		this.mat = mat;
		this.name = name;
		P1 = p1;
		P2 = p2;
		T = t;
	}
	
	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getP1() {
		return P1;
	}
	
	public void setP1(double p1) {
		P1 = p1;
	}
	
	public double getP2() {
		return P2;
	}
	
	public void setP2(double p2) {
		P2 = p2;
	}
	
	public double getT() {
		return T;
	}
	
	public void setT(double t) {
		T = t;
	}
	
	public double media(double P1, double P2, double T) {
		return (2.5*P1 + 2.5*P2 + 2*T)/7;
	}
	
	public double provaFinal(double MP, double EF) {
		
		if(MP < 3 || MP >= 7) {
			return 0;
		}
		else {
			double MF = (MP*6 + EF*4)/10;
			return MF;
		}
	}
}
