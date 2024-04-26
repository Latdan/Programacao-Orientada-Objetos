import java.util.Scanner;

public class MapaBotW {

    private static boolean[][] mapa = new boolean[4][4];

    public static void main(String[] args) {
 
        preencherMapa();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a linha da torre: ");
        int linhaTorre = scanner.nextInt() - 1;
        System.out.print("Digite a coluna da torre: ");
        int colunaTorre = scanner.nextInt() - 1;

        ativarTorre(linhaTorre, colunaTorre);

        imprimirMapa();
    }

    private static void preencherMapa() {
        for (int linha = 0; linha < mapa.length; linha++) {
            for (int coluna = 0; coluna < mapa[linha].length; coluna++) {
                mapa[linha][coluna] = false;
            }
        }
    }

    private static void ativarTorre(int linhaTorre, int colunaTorre) {
        mapa[linhaTorre][colunaTorre] = true;
    }

    private static void imprimirMapa() {
        for (int linha = 0; linha < mapa.length; linha++) {
            for (int coluna = 0; coluna < mapa[linha].length; coluna++) {
                System.out.print(mapa[linha][coluna] ? "O" : "X");
            }
            System.out.println();
        }
    }
}