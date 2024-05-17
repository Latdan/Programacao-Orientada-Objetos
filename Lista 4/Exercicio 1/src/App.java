class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando.");
    }

    public void frear() {
        System.out.println("O carro " + modelo + " está freando.");
    }

    public void imprimirDados() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Profissão: " + profissao);
    }
}

class Evento {
    private String nome;
    private String data;
    private String local;

    public Evento(String nome, String data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public void iniciar() {
        System.out.println("O evento " + nome + " está começando.");
    }

    public void terminar() {
        System.out.println("O evento " + nome + " está terminando.");
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome + ", Data: " + data + ", Local: " + local);
    }
}

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen", "Nivus", 2022);
        Pessoa pessoa = new Pessoa("Gabriel", 21, "Auxiliar administrativo");
        Evento evento = new Evento("Brasil Game Show", "15/01/2025", "São Paulo");

        carro.imprimirDados();
        pessoa.imprimirDados();
        evento.imprimirDados();
    }
}
