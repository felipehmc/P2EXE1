package exe1.P2E1;

public class Book extends Product {

	private String title;
	
	public Book(String title, double price){
		super(price);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
}
