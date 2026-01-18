public class DevisDisplayService {
    public void displayDevis(Devis devis) {
        System.out.println("\n--- DEVIS ---");
        System.out.println("Date : " + devis.getDate());
        System.out.println("Montant HT : " + devis.getMontantHT());
        System.out.println("TVA : " + devis.getTva());
        System.out.println("Total TTC : " + devis.getTotal());
        System.out.println("Valable 30 jours");
    }
}

