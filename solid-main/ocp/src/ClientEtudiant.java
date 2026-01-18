public class ClientEtudiant extends Client {

    @Override
    public double appliquerRemise(double montant) {
        return montant * 0.9;
    }
}

