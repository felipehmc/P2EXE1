package exe1.P2E1;

public abstract class Product {

	protected double price;
	static int numberOfRates = 0;
	static double nota = 0;
	protected String descricao;
	
	public Product(double price, String descricao) {
		this.price = price;
		this.descricao = descricao;
	}
	
	public void setNota(double _nota) {
		nota = nota*numberOfRates + _nota;
		numberOfRates++;
		nota = nota/numberOfRates;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getNota() {
		if(numberOfRates > 0)
			return String.valueOf(nota);
		else {
			return "Nenhuma avaliacao ate o momento";
		}
	}
	
	public abstract void printInformation();
	
}
