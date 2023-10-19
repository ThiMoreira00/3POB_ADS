package br.edu.faeterj;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    	ArrayList<Produto> produtos = new ArrayList<Produto>();
    	Produto p1, p2, p3;
        ItensCarrinho item;
        int produto_escolhido, quantidade_escolhido;
        boolean resposta;
        ArrayList<ItensCarrinho> array_itens_carrinho;

        p1 = new Produto(1, "Camiseta", 100);
        p2 = new Produto(2, "Short", 50);
        p3 = new Produto(3, "Calça", 150);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        
        do {
            
        for (Produto p : produtos) {
            p.listar();
        }

        // Perguntando qual produto o usuário deseja comprar
        System.out.println("Qual produto você deseja comprar? (Escolha pelo ID)");
        produto_escolhido = sc.nextInt();

        System.out.println("Quantidade de " + produtos.get(produto_escolhido - 1).getNome() + " que você deseja comprar: ");
        quantidade_escolhido = sc.nextInt();

        item = new ItensCarrinho(produtos.get(produto_escolhido - 1).getId(), quantidade_escolhido);
        Carrinho.adicionarProduto(Carrinho.getItens_carrinho(), item); // LEMBRAR: adicionar tipo de itensCarrinho como parâmetro
        System.out.println("Produto adicionado ao carrinho!");
        
        resposta = Menu.acoes();

        } while(resposta == true);

    }
}