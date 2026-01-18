import java.time.LocalDate;

public class Facture {
    private LocalDate date;
    private String clientName;
    private double montantHT;
    private double tva;
    private double total;

    public Facture(LocalDate date, String clientName, double montantHT, double tva, double total) {
        this.date = date;
        this.clientName = clientName;
        this.montantHT = montantHT;
        this.tva = tva;
        this.total = total;
    }

    // Getters
    public LocalDate getDate() { return date; }
    public String getClientName() { return clientName; }
    public double getMontantHT() { return montantHT; }
    public double getTva() { return tva; }
    public double getTotal() { return total; }
}
