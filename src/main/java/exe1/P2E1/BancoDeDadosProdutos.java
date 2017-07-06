package exe1.P2E1;

import java.util.ArrayList;

public class BancoDeDadosProdutos {

	private static BancoDeDadosProdutos instancia;
	ArrayList<Double> listaPrecos;
	ArrayList<String> listaNomes;
	ArrayList<String> tiposDeMercadorias;
	ArrayList<String> listaDescricoes;
	
	private BancoDeDadosProdutos() {
		listaPrecos = new ArrayList<Double>();
		listaNomes = new ArrayList<String>();
		tiposDeMercadorias = new ArrayList<String>();
	}
	
	public static BancoDeDadosProdutos getInstance(){
		if (instancia == null)
			instancia = new BancoDeDadosProdutos();
		
		return instancia;
	}
	
	public void adicionaMercadoria(String nome, double preco, String descricao, 
			String tipoDeMercadoria){
		if(posicaoNaLista(nome) != -1) {
			listaNomes.add(nome);
			listaPrecos.add(preco);
			listaDescricoes.add(descricao);
			tiposDeMercadorias.add(tipoDeMercadoria);
		}
	}

	public int posicaoNaLista(String nome){
		for(int i=0; i<listaNomes.size(); i++){
			if(nome.equals(listaNomes.get(i))){
				return i;
			}
		}
		return -1;
	}
	
	public Product geraProduto(int indice) {
		if(tiposDeMercadorias.equals("book")) {
			return geraLivro(indice);
		}
		return null;
	}
	
	private Product geraLivro(int indice){
		String nome = listaNomes.get(indice);
		double preco = listaPrecos.get(indice);
		String descricao = listaDescricoes.get(indice);
		Product newProduct = new Book(nome, preco, descricao);
		return newProduct;
	}
	
	
}
