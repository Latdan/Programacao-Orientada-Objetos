public class Tijolo {
    private int id;
    private String cor;
    private String furos;

    public Tijolo(int id, String cor, String furos) {
        this.id = id;
        this.cor = cor;
        this.furos = furos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFuros() {
        return furos;
    }

    public void setFuros(String furos) {
        this.furos = furos;
    }

    @Override
    public String toString() {
        return "Tijolo{" +
                "id=" + id +
                ", cor='" + cor + '\'' +
                ", furos='" + furos + '\'' +
                '}';
    }
}