package org.webscraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Produto {
    private String url;
    private String titulo;
    private String preco;
    private String descricao;
    private String imagem;

    public Produto() {}

    public Produto(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void pegarTitulo(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Element elementTitulo = doc.selectFirst("h1.product-name");

            String titulo = "N/A";
            if (elementTitulo != null) {
                titulo = elementTitulo.text();
            }

            this.titulo = titulo;

        } catch (Exception e) {
            System.out.println("Algo deu errado! " + e.getMessage());
        }
    }

    public void pegarPreco(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Element elementPreco = doc.selectFirst("span.saleInCents-value");

            String preco = "N/A";
            if (elementPreco != null) {
                preco = elementPreco.text();
            }

            this.preco = preco;

        } catch (Exception e) {
            System.out.println("Algo deu errado! " + e.getMessage());
        }
    }

    public void pegarDescricao(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Element elementDescricao = doc.selectFirst("p.features--description");

            String descricao = "N/A";
            if (elementDescricao != null) {
                descricao = elementDescricao.text();
            }

            this.descricao = descricao;

        } catch (Exception e) {
            System.out.println("Algo deu errado! " + e.getMessage());
        }
    }

    public void pegarImagem(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Element elementImagem = doc.selectFirst("img[fetchpriority=low]");;

            String imagemUrl = "N/A";
            if (elementImagem != null) {
                imagemUrl = elementImagem.attr("src");
            }

            this.imagem = imagemUrl;

        } catch (Exception e) {
            System.out.println("Algo deu errado! " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Produto\n" +
                "Título-> " + titulo + '\n' +
                "Preço-> " + preco + '\n' +
                "Descrição-> " + descricao + '\n' +
                "Imagem-> " + imagem;
    }
}
