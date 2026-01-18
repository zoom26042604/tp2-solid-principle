import java.util.Scanner;

public class MainLsp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Compte compte = choisirCompte(scanner);

        System.out.println("\n--- MENU ---");
        System.out.println("1. Consulter solde");
        System.out.println("2. Déposer");
        if (compte instanceof CompteAvecRetrait) {
            System.out.println("3. Retirer");
        }
        if (compte instanceof CompteEpargne) {
            System.out.println("4. Calculer intérêts");
        }
        System.out.print("Choix : ");

        int action = lireEntier(scanner);

        switch (action) {
            case 1:
                System.out.println("Solde actuel : " + compte.getSolde());
                break;
            case 2:
                System.out.print("Montant à déposer : ");
                double montantDepot = lireDouble(scanner);
                compte.deposer(montantDepot);
                System.out.println("Dépôt effectué. Nouveau solde : " + compte.getSolde());
                break;
            case 3:
                if (compte instanceof CompteAvecRetrait) {
                    System.out.print("Montant à retirer : ");
                    double montantRetrait = lireDouble(scanner);
                    ((CompteAvecRetrait) compte).retirer(montantRetrait);
                } else {
                    System.out.println("Opération non disponible pour ce type de compte.");
                }
                break;
            case 4:
                if (compte instanceof CompteEpargne) {
                    ((CompteEpargne) compte).calculerInterets();
                } else {
                    System.out.println("Opération non disponible pour ce type de compte.");
                }
                break;
            default:
                System.out.println("Choix invalide.");
        }

        scanner.close();
    }

    private static Compte choisirCompte(Scanner scanner) {
        System.out.println("\n--- TYPE DE COMPTE ---");
        System.out.println("1. Compte courant");
        System.out.println("2. Compte bancaire");
        System.out.println("3. PEL");
        System.out.println("4. Compte épargne");
        System.out.print("Choix : ");

        int choix = lireEntier(scanner);

        switch (choix) {
            case 1:
                return new CompteCourant(100);
            case 2:
                return new CompteBancaire(100);
            case 3:
                return new PEL(100);
            case 4:
                return new CompteEpargne(100, 0.02);
            default:
                System.out.println("Choix invalide. Compte courant par défaut.");
                return new CompteCourant(100);
        }
    }

    private static int lireEntier(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }

    private static double lireDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }
}
