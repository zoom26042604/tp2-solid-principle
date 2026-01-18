import java.util.Scanner;

public class MainOCP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculateurRemise calculateur = new CalculateurRemise();

        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Client standard");
            System.out.println("2. Client étudiant");
            System.out.println("3. Client VIP");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choix = lireEntier(scanner);

            if (choix == 0) {
                quitter = true;
                continue;
            }

            Client client;
            switch (choix) {
                case 1:
                    client = new ClientStandard();
                    break;
                case 2:
                    client = new ClientEtudiant();
                    break;
                case 3:
                    client = new ClientVIP();
                    break;
                default:
                    System.out.println("Type client inconnu");
                    continue;
            }

            System.out.print("Montant HT : ");
            double montant = lireDouble(scanner);

            double total = calculateur.calculerTotal(client, montant);
            System.out.println("Montant après remise : " + total);
        }

        scanner.close();
    }

    private static int lireEntier(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide. Recommencez : ");
            }
        }
    }

    private static double lireDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide. Recommencez : ");
            }
        }
    }
}
