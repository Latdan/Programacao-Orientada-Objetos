package ANIMAIS;

public class CACHORRO implements ANIMAL {
    private String nome;
    private String raca;

    public CACHORRO(String nome, String raca) {
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

    @Override
    public void comer() {
        System.out.println("Comendo ração rapidamente.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}