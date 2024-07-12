import java.util.Random;

public class App {
    public static void main(String[] args) {
        Tijolo[] pilhaDeTijolos = new Tijolo[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int id = i + 1;
            String cor = random.nextBoolean() ? "preto" : "branco";
            String furos = String.valueOf(random.nextInt(8) + 1);
            Tijolo tijolo = new Tijolo(id, cor, furos);
            pilhaDeTijolos[i] = tijolo;

            System.out.println("Produzindo tijolo com id = " + id);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int pretosPares = 0, pretosImpares = 0, brancosPares = 0, brancosImpares = 0;
        int totalPretos = 0, totalBrancos = 0;

        for (Tijolo tijolo : pilhaDeTijolos) {
            int furos = Integer.parseInt(tijolo.getFuros());
            boolean furosPares = furos % 2 == 0;

            if (tijolo.getCor().equals("preto")) {
                totalPretos++;
                if (furosPares) {
                    pretosPares++;
                } else {
                    pretosImpares++;
                }
            } else {
                totalBrancos++;
                if (furosPares) {
                    brancosPares++;
                } else {
                    brancosImpares++;
                }
            }
        }

        System.out.println("Número de tijolos pretos com furos pares: " + pretosPares);
        System.out.println("Número de tijolos pretos com furos ímpares: " + pretosImpares);
        System.out.println("Número de tijolos brancos com furos pares: " + brancosPares);
        System.out.println("Número de tijolos brancos com furos ímpares: " + brancosImpares);
        System.out.println("Quantidade total de tijolos pretos: " + totalPretos);
        System.out.println("Quantidade total de tijolos brancos: " + totalBrancos);

        Tijolo tijolo76 = pilhaDeTijolos[75];
        System.out.println("Propriedades do tijolo com ID 76: " + tijolo76);
    }
}