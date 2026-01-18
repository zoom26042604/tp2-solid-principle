import java.io.FileWriter;
import java.io.IOException;

public class FactureStorageService {
    public void saveFacture(Facture facture) {
        try (FileWriter writer = new FileWriter("factures.txt", true)) {
            writer.write("FACTURE | " + facture.getDate()
                    + " | Client=" + facture.getClientName()
                    + " | HT=" + facture.getMontantHT()
                    + " | TVA=" + facture.getTva()
                    + " | TTC=" + facture.getTotal() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

