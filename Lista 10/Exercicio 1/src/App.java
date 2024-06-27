import locadora.*;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O Poderoso Chefão", "Francis Ford Coppola", Arrays.asList("Marlon Brando", "Al Pacino", "James Caan"));
        Filme filme2 = new Filme("Matrix", "Lana Wachowski", Arrays.asList("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss"));

        Jogo jogo1 = new Jogo("The Legend of Zelda: Breath of the Wild", "Nintendo Switch");
        Jogo jogo2 = new Jogo("God of War", "PlayStation 4");

        Locadora<AudioVisual> locadora = new Locadora<>();
        locadora.adicionarItem(filme1);
        locadora.adicionarItem(filme2);
        locadora.adicionarItem(jogo1);
        locadora.adicionarItem(jogo2);

        System.out.println("Itens na Locadora:");
        locadora.listarItens();

        System.out.println("Buscando item: Matrix");
        AudioVisual itemBuscado = locadora.buscarItem("Matrix");
        if (itemBuscado != null) {
            itemBuscado.exibirInfo();
        } else {
            System.out.println("Item não encontrado.");
        }
    }
}