import java.time.LocalDate;

public class FacturationService {
    private TaxCalculator taxCalculator;
    private FactureDisplayService factureDisplayService;
    private FactureStorageService factureStorageService;

    public FacturationService(TaxCalculator taxCalculator,
                              FactureDisplayService factureDisplayService,
                              FactureStorageService factureStorageService) {
        this.taxCalculator = taxCalculator;
        this.factureDisplayService = factureDisplayService;
        this.factureStorageService = factureStorageService;
    }

    public void creerFacture(double montantHT, String clientName) {
        double tva = taxCalculator.calculateTVA(montantHT);
        double total = taxCalculator.calculateTotal(montantHT, tva);

        Facture facture = new Facture(LocalDate.now(), clientName, montantHT, tva, total);

        factureDisplayService.displayFacture(facture);
        factureStorageService.saveFacture(facture);
    }
}
