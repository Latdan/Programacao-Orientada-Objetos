public class App {
    public static void main(String[] args) {
        Musica musica1 = new Musica ("Bohemian Rhapsody", "Queen", "A Night at the Opera");
        Musica musica2 = new Musica ("Stairway to Heaven", "Led Zeppelin", "Led Zeppelin IV");
        Musica musica3 = new Musica ("Hotel California", "Eagles", "Hotel California");

        BibliotecaMusical biblioteca = new BibliotecaMusical();

        biblioteca.adicionarMusica(musica1.getTitulo(), musica1);
        biblioteca.adicionarMusica(musica2.getTitulo(), musica2);
        biblioteca.adicionarMusica(musica3.getTitulo(), musica3);

        System.out.println("Músicas na biblioteca:");
        biblioteca.listarMusicas();

        try {
            Musica buscada = biblioteca.buscarMusica("Stairway to Heaven");
            System.out.println("Música encontrada: " + buscada);
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }

        try {
            Musica buscada = biblioteca.buscarMusica("Imagine");
            System.out.println("Música encontrada: " + buscada);
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}