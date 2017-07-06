package exe1.P2E1;

public abstract class Product {

	protected double price;
	static int numberOfRates = 0;
	static double nota = 0;
	
	public Product(double price) {
		this.price = price;
	}
	
	public void setNota(double _nota) {
		nota = nota*numberOfRates + _nota;
		numberOfRates++;
		nota = nota/numberOfRates;
	}
	
	public double getPrice(){
		return price;
	}
	
	public double getNota() {
		return nota;
	}
	
}
