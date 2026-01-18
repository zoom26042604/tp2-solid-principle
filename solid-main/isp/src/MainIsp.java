import java.util.Scanner;

public class MainIsp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Imprimante basique");
            System.out.println("2. Imprimante simple");
            System.out.println("3. Imprimante avec scanner");
            System.out.println("4. Machine multifonction");
            System.out.println("0. Quitter");
            System.out.print("Choix machine : ");

            int choixMachine = lireEntier(scanner);
            if (choixMachine == 0) break;

            Object machine = creerMachine(choixMachine);
            if (machine == null) {
                System.out.println("Choix invalide");
                continue;
            }

            afficherMenuFonctions(machine);
            System.out.print("Choix fonctionnalité : ");

            int fonction = lireEntier(scanner);
            executerFonction(machine, fonction);
        }

        scanner.close();
    }

    private static Object creerMachine(int choix) {
        switch (choix) {
            case 1:
                return new ImprimanteBasique();
            case 2:
                return new ImprimanteSimple();
            case 3:
                return new ImprimanteScanneur();
            case 4:
                return new MachineMultifonction();
            default:
                return null;
        }
    }

    private static void afficherMenuFonctions(Object machine) {
        System.out.println("\nFonctionnalités disponibles :");
        if (machine instanceof Imprimante) {
            System.out.println("1. Imprimer");
        }
        if (machine instanceof Scanneur) {
            System.out.println("2. Scanner");
        }
        if (machine instanceof Fax) {
            System.out.println("3. Faxer");
        }
    }

    private static void executerFonction(Object machine, int fonction) {
        switch (fonction) {
            case 1:
                if (machine instanceof Imprimante) {
                    ((Imprimante) machine).imprimer();
                } else {
                    System.out.println("Fonctionnalité non supportée par cette machine");
                }
                break;
            case 2:
                if (machine instanceof Scanneur) {
                    ((Scanneur) machine).scanner();
                } else {
                    System.out.println("Fonctionnalité non supportée par cette machine");
                }
                break;
            case 3:
                if (machine instanceof Fax) {
                    ((Fax) machine).faxer();
                } else {
                    System.out.println("Fonctionnalité non supportée par cette machine");
                }
                break;
            default:
                System.out.println("Fonction inconnue");
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
}
