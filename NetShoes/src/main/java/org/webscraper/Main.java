package org.webscraper;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("https://www.netshoes.com.br/p/tenis-coca-cola-sense-ii-feminino-preto-e-branco-GGG-6010-006");

        produto.pegarTitulo(produto.getUrl());

        produto.pegarPreco(produto.getUrl());

        produto.pegarDescricao(produto.getUrl());

        produto.pegarImagem(produto.getUrl());

        System.out.println(produto);
    }
}