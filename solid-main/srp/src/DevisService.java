import java.time.LocalDate;

public class DevisService {
    private TaxCalculator taxCalculator;
    private DevisDisplayService devisDisplayService;
    private DevisStorageService devisStorageService;

    public DevisService(TaxCalculator taxCalculator,
                        DevisDisplayService devisDisplayService,
                        DevisStorageService devisStorageService) {
        this.taxCalculator = taxCalculator;
        this.devisDisplayService = devisDisplayService;
        this.devisStorageService = devisStorageService;
    }

    public void creerDevis(double montantHT) {
        double tva = taxCalculator.calculateTVA(montantHT);
        double total = taxCalculator.calculateTotal(montantHT, tva);

        Devis devis = new Devis(LocalDate.now(), montantHT, tva, total);

        devisDisplayService.displayDevis(devis);
        devisStorageService.saveDevis(devis);
    }
}

