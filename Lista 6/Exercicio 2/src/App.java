import ANIMAIS.GATO;
import ANIMAIS.CACHORRO;

public class App {
    public static void main(String[] args) {
        GATO gato = new GATO("Figaro", "De rua");
        CACHORRO cachorro = new CACHORRO("Pitty", "Vira-Lata");

        System.out.println("Gato:");
        gato.comer();
        gato.emitirSom();

        System.out.println("\nCachorro:");
        cachorro.comer();
        cachorro.emitirSom();
    }
}