package loja;

public class App {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja("Sua Tec");

        Produto produto1 = new Produto("Iphone", 5999.99, 12);
        Produto produto2 = new Produto("Pc gamer completo", 4259.99, 3);
        Produto produto3 = new Produto("Processador Ryzen 5", 599.99, 15);

        minhaLoja.adicionarProduto(produto1);
        minhaLoja.adicionarProduto(produto2);
        minhaLoja.adicionarProduto(produto3);

        System.out.println("Produtos cadastrados na " + minhaLoja.getNome() + ":");
        minhaLoja.listarProdutos();
    }
}
