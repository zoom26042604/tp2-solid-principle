public abstract class Compte {

    protected double solde;

    public Compte(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        solde += montant;
    }
}
