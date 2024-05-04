import java.util.Scanner;

public class Quiz {

    private static final int NUM_PERGUNTAS = 3;
    private static String[] RESPOSTAS = new String[NUM_PERGUNTAS];
    private static final String[] GABARITO = {"A", "B", "A"};
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String nomeFormatado = obterNomeFormatado();

        iniciarQuiz(nomeFormatado);

        fazerPergunta(1, "Qual o nome da capital do Brasil", "A) Brasília", "B) São Paulo", "C) Espirito Santo", "D) Rio de Janeiro");
        fazerPergunta(2, "Quantos estados tem o Brasil?", "A) 27", "B) 26", "C) 28", "D) 29");
        fazerPergunta(3, "Qual o sistema operacional mais utilizado no mundo?", "A) Windows", "B) macOS", "C) Linux", "D) Chrome OS");

        mostrarResultadoQuiz(nomeFormatado);

        agradecerUsuario(nomeFormatado);
    }

    private static String obterNomeFormatado() {
        System.out.print("Digite seu nome: ");
        String nome = SCANNER.nextLine();
        return formatarNome(nome);
    }

    private static String formatarNome(String nome) {
        return nome.toUpperCase().charAt(0) + nome.substring(1).toLowerCase();
    }

    private static void iniciarQuiz(String nomeFormatado) {

        System.out.printf("Bem-vindo(a) ao Quiz, %s!\n", nomeFormatado);
        System.out.println("Neste quiz, você terá que responder 3 perguntas. Digite 'Enter' para começar.");
        SCANNER.nextLine();
    }

    private static void fazerPergunta(int numeroPergunta, String pergunta, String alternativaA, String alternativaB, String alternativaC, String alternativaD) {
        System.out.println("\nPergunta " + numeroPergunta + ":");
        System.out.println(pergunta);
        System.out.println(alternativaA);
        System.out.println(alternativaB);
        System.out.println(alternativaC);
        System.out.println(alternativaD);

        String respostaUsuario;
        do {
            System.out.print("Digite sua resposta: ");
            respostaUsuario = SCANNER.nextLine();
        } while (!validarResposta(respostaUsuario));

        RESPOSTAS[numeroPergunta - 1] = respostaUsuario;
    }

    private static boolean validarResposta(String respostaUsuario) {
        if (respostaUsuario.isEmpty() || respostaUsuario.isBlank()) {
            System.out.println("Você precisa digitar uma resposta...");
            return false;
        }
        return true;
    }

    private static void mostrarResultadoQuiz(String nomeFormatado) {
        int acertos = 0;
        for (int i = 0; i < NUM_PERGUNTAS; i++) {
            if (RESPOSTAS[i].equalsIgnoreCase(GABARITO[i])) {
                acertos++;
            }
        }

        System.out.printf("Resultado do Quiz, %s:\n", nomeFormatado);
        System.out.printf("Você acertou %d de %d perguntas!\n", acertos, NUM_PERGUNTAS);

        if (acertos == 3) {
            System.out.println("Parabéns, você mandou bem no quiz!");
        } else if (acertos >0 && acertos <3) {
            System.out.println("Você foi bem, mas tem que estudar mais!");
        } else {
            System.out.println("Precisa estudar mais");
        }
    }

    private static void agradecerUsuario(String nomeFormatado) {
        System.out.println("");
    }
}