package br.edu.faeterj;

import java.util.ArrayList;

public class Carrinho {
	int id;
	float total;
	ArrayList<ItensCarrinho> itens_carrinho;
	
    public Carrinho(int id, float total, ArrayList<ItensCarrinho> itens_carrinho) {
		super();
		this.id = id;
		this.total = total;
		this.itens_carrinho = itens_carrinho;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public ArrayList<ItensCarrinho> getItens_carrinho() {
		return itens_carrinho;
	}

	public void setItens_carrinho(ArrayList<ItensCarrinho> itens_carrinho) {
		this.itens_carrinho = itens_carrinho;
	}

	public static void adicionarProduto(ArrayList<ItensCarrinho> array_itens, ItensCarrinho itens_carr) {
        array_itens.add(itens_carr);
    }

    public void listarCarrinho() {
        for(ItensCarrinho itens_carr : itens_carrinho) {
            itens_carr.listar();
        }
    }

    public int buscar(int id_produto) {

        for(ItensCarrinho itens : itens_carrinho) {
            if(itens.getId_produto() == id_produto) {
                return itens_carrinho.indexOf(itens);
            }
        }

        return -1;


    }
}
