
import java.util.Scanner;

public class MediaNotasFilme {

    private static final int NUM_CRITICOS = 3;
    private static final float[] NOTAS = new float[NUM_CRITICOS];
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        obterNotasCriticos();

        calcularEImprimirMedia();
    }

    private static void obterNotasCriticos() {
        for (int i = 0; i < NUM_CRITICOS; i++) {
            System.out.print("Digite a nota do crítico " + (i + 1) + ": ");
            NOTAS[i] = SCANNER.nextFloat();
        }
    }

    private static void calcularEImprimirMedia() {
        float media = 0;
        for (float nota : NOTAS) {
            media += nota;
        }
        media /= NUM_CRITICOS;

        System.out.printf("A média das notas do filme é: %.1f\n", media);
    }
}