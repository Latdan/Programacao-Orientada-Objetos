import VEICULOS.CARRO;
import VEICULOS.BICICLETA;

public class App {
    public static void main(String[] args) {
        CARRO carro = new CARRO("Honda", 2024);
        BICICLETA bicicleta = new BICICLETA("Caloi", 21);

        System.out.println("Carro:");
        carro.acelerar();
        carro.frear();

        System.out.println("\nBicicleta:");
        bicicleta.acelerar();
        bicicleta.frear();
    }
}