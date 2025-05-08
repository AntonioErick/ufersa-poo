package Utilities;

/*
Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desli-
gado) e os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua

um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para

isso, utilize uma instância da classe Contador criada anteriormente e implemente a ló-
gica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre

as capacidades da classe criada.
*/

public class Lampada {

	private boolean lightStatus;
	Contador count = new Contador(0);
	
	public Lampada(boolean lightStatus) {
		this.lightStatus = lightStatus;
	}
	
	public void turnOn() {
		if(lightStatus == true) {
			System.out.println("Lampada já está acesa.");
		}
		else {
			lightStatus = true;
			int contador = count.incrementCounter();
			System.out.println("Lampada acesa.");
			System.out.println("A lampada foi ligada: "+ (contador + 1) +" vezes.");
		}
	}
	
	public void turnOff() {
		if(lightStatus == false) {
			System.out.println("Lampada já está apagda.");
		}
		else {
			lightStatus = false;
			System.out.println("Lampada apagada.");
		}
	}
	
	public void showStatus() {
		if(lightStatus == true) {
			System.out.println("A lampada está acesa.");
		}
		else {
			System.out.println("A lampada está apagada.");
		}
	}
	
	public boolean isItOn() {
		return lightStatus;
	}
}
