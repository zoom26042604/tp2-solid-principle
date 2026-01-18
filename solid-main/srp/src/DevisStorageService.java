import java.io.FileWriter;
import java.io.IOException;

public class DevisStorageService {
    public void saveDevis(Devis devis) {
        try (FileWriter writer = new FileWriter("devis.txt", true)) {
            writer.write("DEVIS | " + devis.getDate()
                    + " | HT=" + devis.getMontantHT()
                    + " | TVA=" + devis.getTva()
                    + " | TTC=" + devis.getTotal()
                    + " | validite=30j\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

