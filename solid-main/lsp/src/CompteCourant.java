public class CompteCourant extends Compte implements CompteAvecRetrait {

    public CompteCourant(double soldeInitial) {
        super(soldeInitial);
    }

    @Override
    public void retirer(double montant) {
        solde -= montant;
        System.out.println("Retrait effectué. Nouveau solde : " + solde);
    }
}

