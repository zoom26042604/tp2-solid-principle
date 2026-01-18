public class TaxCalculator {
    private static final double TVA_RATE = 0.2;

    public double calculateTVA(double montantHT) {
        return montantHT * TVA_RATE;
    }

    public double calculateTotal(double montantHT, double tva) {
        return montantHT + tva;
    }
}
