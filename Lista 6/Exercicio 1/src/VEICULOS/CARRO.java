package VEICULOS;

public class CARRO implements VEICULO {
    private String marca;
    private int ano;

    public CARRO(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("Vrooooommm!!");
    }

    public void frear() {
        System.out.println("Scriiii!");
    }
}
