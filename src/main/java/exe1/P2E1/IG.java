package exe1.P2E1;

public class IG {
	
	User user;

	IG(User u){
		user = u;
	}
	
	public void checkOrderStatus(Order order){
		user.checkOrderStatus(order);
	}
	
	public void buyAProduct(Product p) {
		user.buyAProduct(p);
	}
	
	public void rateAProduct(Product p, double nota) {
		user.rateAProduct(p, nota);
	}
	
	public static void main(String[] args) {
		User u = new User();
		System.out.println();

	}

}
