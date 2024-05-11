import java.util.Scanner;

public class IdadeEm2024 {

    private static final int ANO_ATUAL = 2024;

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = calcularIdadeEm2024(anoNascimento);

        System.out.printf("Até o final de 2024 você terá %d anos.\n", idade);
    }

    private static int calcularIdadeEm2024(int anoNascimento) {
        return ANO_ATUAL - anoNascimento;
    }
}