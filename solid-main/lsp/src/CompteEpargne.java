public class CompteEpargne extends Compte {

    private final double tauxInteret;

    public CompteEpargne(double soldeInitial, double tauxInteret) {
        super(soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void calculerInterets() {
        double interets = solde * tauxInteret;
        solde += interets;
        System.out.println("Intérêts calculés : " + interets);
        System.out.println("Nouveau solde : " + solde);
    }
}

