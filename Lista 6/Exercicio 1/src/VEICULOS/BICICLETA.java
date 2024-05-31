package VEICULOS;

public class BICICLETA implements VEICULO {
    private String modelo;
    private int numeroMarchas;

    public BICICLETA(String modelo, int numeroMarchas) {
        this.modelo = modelo;
        this.numeroMarchas = numeroMarchas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public void acelerar() {
        System.out.println("Vuuc trek trek!");
    }

    public void frear() {
        System.out.println("Ziiii!");
    }
}
