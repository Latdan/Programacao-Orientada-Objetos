import java.util.Scanner;

public class CompararPalavras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        compararPalavras(palavra1, palavra2);
    }

    private static void compararPalavras(String palavra1, String palavra2) {
        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras sao identicas");
            return;
        }

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
            return;
        }

        System.out.println("As palavras sao diferentes");
    }
}