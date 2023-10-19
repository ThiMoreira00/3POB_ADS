package br.edu.faeterj;

public class ItensCarrinho {

	int id_produto;
	int quantidade;

	public ItensCarrinho(int id_produto, int quantidade) {
		super();
		this.id_produto = id_produto;
		this.quantidade = quantidade;
	}

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void listar() {

		System.out.println(this.getQuantidade() + "x " + Carrinho.itens_carrinho.indexOf(Carrinho.buscar(this.getId_produto() - 1)));

		// Obtendo o nome do produto listado
		Produto.get(this.getId_produto() - 1).listar();
	}

}
