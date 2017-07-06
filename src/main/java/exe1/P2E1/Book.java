package exe1.P2E1;

public class Book extends Product {

	private String title;
	
	public Book(String title, double price, String descricao){
		super(price, descricao);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	@Override
	public void printInformation() {
		System.out.println("Nome: " + title);
		System.out.println("Preco: " + price);
		System.out.println("Avaliacao dos clientes: " + nota);
	}
	
}
