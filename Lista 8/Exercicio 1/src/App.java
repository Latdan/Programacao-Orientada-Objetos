import loja.NomeInvalidoException;
import loja.PrecoInvalidoException;
import loja.Produto;

public class App {
    public static void main(String[] args) {
        try {
            Produto produtoValido = new Produto("Notebook", 1500.00);
            System.out.println("Produto criado: " + produtoValido.getNome() + " - " + produtoValido.getPreco());

            try {
                Produto produtoNomeInvalido = new Produto("PC", 1000.00);
            } catch (NomeInvalidoException e) {
                System.out.println("Erro ao criar produto: " + e.getMessage());
            }

            try {
                Produto produtoPrecoInvalido = new Produto("Smartphone", -500.00);
            } catch (PrecoInvalidoException e) {
                System.out.println("Erro ao criar produto: " + e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}