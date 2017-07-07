package exe1.P2E1;

import java.util.ArrayList;

public class BancoDeDadosProdutos {

	private static BancoDeDadosProdutos instancia;
	ArrayList<Double> listaPrecos;
	ArrayList<String> listaNomes;
	ArrayList<String> tiposDeMercadorias;
	ArrayList<String> listaDescricoes;
	ArrayList<Product> produtos;
	
	private BancoDeDadosProdutos() {
		listaPrecos = new ArrayList<Double>();
		listaNomes = new ArrayList<String>();
		tiposDeMercadorias = new ArrayList<String>();
		listaDescricoes = new ArrayList<String>();
		produtos = new ArrayList<Product>();
	}
	
	public static BancoDeDadosProdutos getInstance(){
		if (instancia == null)
			instancia = new BancoDeDadosProdutos();
		
		return instancia;
	}
	
	public void adicionaMercadoria(String nome, double preco, String descricao, 
			String tipoDeMercadoria){
		if(posicaoNaLista(nome) == -1) {
			listaNomes.add(nome);
			listaPrecos.add(preco);
			listaDescricoes.add(descricao);
			tiposDeMercadorias.add(tipoDeMercadoria);
			geraProduto(posicaoNaLista(nome));
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
	
	private Product geraProduto(int indice) {
		if(tiposDeMercadorias.get(indice).equals("book")) {
			Product p = geraLivro(indice);
			produtos.add(p);
			return p;
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
	
	public String retornaDescricao(int indice) {
		try {
			String descricao = "Nome: " + listaNomes.get(indice) + "\nTipo de produto: " + 
					tiposDeMercadorias.get(indice) + "\nPreço: " + listaNomes.get(indice) + "\nDescricao: " +
					listaDescricoes.get(indice) + "\nAvaliacao dos clientes: " + produtos.get(indice).getNota()
					+ "\nNumero de avaliacoes: " + produtos.get(indice).getNumberOfRates();
					return descricao;
		} catch (Exception e) {
		}
		return null;
	}
	
	public void atualizaAvaliacaoDoProduto(int indice, double nota) {
		if(produtos.size() >= indice) {
			produtos.get(indice).setNota(nota);
			System.out.println("Nota dos clientes: " + produtos.get(indice).getNota());
			System.out.println("Numero de avaliacoes: " + produtos.get(indice).getNumberOfRates());
		}
	}
	
	
}
