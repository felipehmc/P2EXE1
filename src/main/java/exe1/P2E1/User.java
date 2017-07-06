package exe1.P2E1;

import java.util.ArrayList;

public class User {

	private ArrayList<Product> productsOfInterest = new ArrayList<Product>();
	private ArrayList<Product> productsBought = new ArrayList<Product>();
	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public void rateAProduct(Product p, double nota) {
		if(productsBought.contains(p))
			p.setNota(nota);
	}
	
	public void buyAProduct(Product p) {
		Order order = new Order(p);
		orders.add(order);
		productsBought.add(p);
	}
	
	public void addProductWanted(Product p) {
		productsOfInterest.add(p);
	}
	
	public void checkOrderStatus(Order order) {
		if(orders.contains(order)) {
			order.getStatus();
		}
	}
	
}
