public class FactureDisplayService {
    public void displayFacture(Facture facture) {
        System.out.println("\n--- FACTURE ---");
        System.out.println("Date : " + facture.getDate());
        System.out.println("Client : " + facture.getClientName());
        System.out.println("Montant HT : " + facture.getMontantHT());
        System.out.println("TVA : " + facture.getTva());
        System.out.println("Total TTC : " + facture.getTotal());
    }
}
