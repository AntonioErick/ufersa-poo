package Utilities;

public class Fatura {

	private int id;
	private String description;
	private double price;
	private int qtd;
	
	public Fatura(int id, String description, double price, int qtd) {
		this.id = id;
		this.description = description;
		this.price = price;
		this.qtd = qtd;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double calculoTotal(int qtd, double price) {
		return qtd * price; 
	}
	
	public String toString() {
		return "Product ID: "+ String.format("%d\n", id) +
			   "Product description: " + String.format("%s\n", description) +
			   "Units: "+ String.format("%d\n", qtd);
	}
}
