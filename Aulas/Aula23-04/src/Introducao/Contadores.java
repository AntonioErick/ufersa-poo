import java.text.DecimalFormat;

public class Contadores {
	//unidades de velocidade
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("00.00");
	    double kph = 0.0, mps, mph, pps;

	    System.out.println("k/h\tm/s\tm/h\tp/s");

	    while(kph <= 50) {
	        mps = kph * 0.2778;
	        mph = kph * 0.6214;
	        pps = kph * 0.9113;
	
	        System.out.print(df.format(kph) + "\t");
	        System.out.print(df.format(mps) + "\t");
	        System.out.print(df.format(mph) + "\t");
	        System.out.print(df.format(pps) + "\t");
	        System.out.println(); // quebra de linha por linha da tabela
	
	        kph += 0.5;
		}
	}
}
