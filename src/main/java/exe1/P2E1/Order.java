package exe1.P2E1;

import java.util.ArrayList;

public class Order {

	ArrayList<Product> produtos = new ArrayList<Product>();
	static int numberOfOrders = 0;
	private int id;
	private boolean comProdutos = false;
	
	private String status = "";
	
	public Order(ArrayList<Product> products) {
		int numberOfproducts = products.size();
		if(numberOfproducts > 0) {
			for(int i = 0; i < numberOfproducts; i++) {
				produtos.add(products.get(i));
			}
			numberOfOrders++;
			id = numberOfOrders;
			comProdutos = true;
			setStatus("Esperando confirmação do pagamento");
		}
	}
	
	public Order(Product p) {
		numberOfOrders++;
		id = numberOfOrders;
		comProdutos = true;
		produtos.add(p);
		setStatus("Esperando confirmação do pagamento");
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public int getId() {
		return id;
	}
	
}
