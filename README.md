# 🛒 Web Scraper de Produtos Netshoes (Java + Jsoup)

Este projeto implementa um **web scraper simples em Java**, utilizando a biblioteca **Jsoup**, para extrair informações de uma **página de produto específica** no site da Netshoes.

## ✅ Funcionalidades

A partir da URL de um produto, o scraper coleta:

- 🏷️ **Título** do produto  
- 💰 **Preço** do produto  
- 📄 **Descrição** detalhada  
- 🖼️ **URL da imagem** principal  

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

- [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado  
- IDE de sua preferência (Eclipse, IntelliJ, VS Code com extensão Java, etc.)

### Passo a Passo

1. **Clone ou baixe** este repositório para o seu computador.

2. **Abra o arquivo `Main.java`** na sua IDE.

3. **Cole a URL de um produto** da Netshoes na linha abaixo:

   ```java
   Produto produto = new Produto("cole aqui o link do produto que quer ver as informações");

Produto
Título     -> Tênis Coca Cola Sense II Feminino Preto e Branco - Preto
Preço      -> R$ 129,90
Descrição  -> Composição cabedal (parte superior): Confeccionado em material têxtil
              Solado: Borracha resistente e vulcanizada
              Palmilha: Em EVA, forrada e removível
              Lingueta: Macia e acolchoada
              Cor predominante: Preto
              Forro: Material têxtil
              Indicado para: Casual
              Ajuste: Cadarço
              Peso aproximado: 560g o par nº 37
Imagem     -> https://static.netshoes.com.br/produtos/tenis-coca-cola-sense-ii-feminino-preto-e-branco/06/GGG-6010-006/GGG-6010-006_zoom2.jpg
