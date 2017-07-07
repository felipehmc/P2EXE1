package exe1.P2E1;

import java.util.ArrayList;

public class User {

	private ArrayList<Product> productsOfInterest = new ArrayList<Product>();
	private ArrayList<Product> productsBought = new ArrayList<Product>();
	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public void rateAProduct(String produto, double nota) {
		int posicao = BancoDeDadosProdutos.getInstance().posicaoNaLista(produto);
		if(posicao != -1) {
			BancoDeDadosProdutos.getInstance().atualizaAvaliacaoDoProduto(posicao, nota);
		}
	}
	
	public void buyAProduct(Product p) {
		Order order = new Order(p);
		orders.add(order);
		productsBought.add(p);
	}
	
	public void buyAProduct(String produto) {
		int posicao = BancoDeDadosProdutos.getInstance().posicaoNaLista(produto);
		if(posicao != -1) {
			
		}
		else System.out.println("Nao temos tal produto");
	}
	
	public void addProductWanted(Product p) {
		productsOfInterest.add(p);
	}
	
	public void checkOrderStatus(Order order) {
		if(orders.contains(order)) {
			order.getStatus();
		}
	}
	
	public void searchAProduct(String nome) {
		int posicao = BancoDeDadosProdutos.getInstance().posicaoNaLista(nome);
		if(posicao != -1) {
			String descricao = BancoDeDadosProdutos.getInstance().retornaDescricao(posicao);
			System.out.println(descricao);
		}
		else System.out.println("Nao temos tal produto");
	}
	
}
