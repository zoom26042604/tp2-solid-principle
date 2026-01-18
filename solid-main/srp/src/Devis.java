import java.time.LocalDate;

public class Devis {
    private LocalDate date;
    private double montantHT;
    private double tva;
    private double total;

    public Devis(LocalDate date, double montantHT, double tva, double total) {
        this.date = date;
        this.montantHT = montantHT;
        this.tva = tva;
        this.total = total;
    }

    // Getters
    public LocalDate getDate() { return date; }
    public double getMontantHT() { return montantHT; }
    public double getTva() { return tva; }
    public double getTotal() { return total; }
}
