import java.util.Scanner;

public class BuscaVetor {

    private static int[] numeros = new int[10];

    private static void preencherVetor() {
        Scanner scanner = new Scanner(System.in);
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            numeros[contador] = scanner.nextInt();
        }
    }

    private static boolean buscarNumero(int numeroBuscado) {
        for (int numero : numeros) {
            if (numero == numeroBuscado) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        preencherVetor();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número a ser buscado: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = buscarNumero(numeroBuscado);

        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }
}