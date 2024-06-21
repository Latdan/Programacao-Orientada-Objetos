import eventos.Show;
import eventos.StandUp;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Show show = new Show("Rock in Rio", "Parque Olímpico", "13/09/2024", Arrays.asList("Travis Scott", "Katy Perry"));
        StandUp standUp = new StandUp("Comedy Night", "Teatro Municipal de São Paulo", "14/09/2024 às 20:00", "Murilo Couto");

        show.exibirInformacoes();
        show.comecarEvento();
        show.comecarEvento(true);

        standUp.exibirInformacoes();
        standUp.comecarEvento();
        standUp.comecarEvento("Por que a galinha atravessou a rua?... Para chegar ao outro lado!");
    }
}