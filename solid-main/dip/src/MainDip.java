import java.util.Scanner;

public class MainDip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Envoyer un email");
            System.out.println("2. Envoyer un SMS");
            System.out.println("3. Envoyer une notification push");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choix = lireEntier(scanner);
            if (choix == 0) break;

            MessageSender sender = creerMessageSender(choix);
            if (sender == null) {
                System.out.println("Choix invalide");
                continue;
            }

            System.out.print("Message : ");
            String message = scanner.nextLine();

            NotificationService service = new NotificationService(sender);
            service.envoyer(message);
        }

        scanner.close();
    }

    private static MessageSender creerMessageSender(int choix) {
        switch (choix) {
            case 1:
                return new EmailSender();
            case 2:
                return new SmsSender();
            case 3:
                return new PushNotificationSender();
            default:
                return null;
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
