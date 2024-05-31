package ANIMAIS;

public class GATO implements ANIMAL {
    private String nome;
    private String raca;

    public GATO(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void comer() {
        System.out.println("Comendo ração desconfiado.");
    }

    public void emitirSom() {
        System.out.println("Miau!");
    }
}