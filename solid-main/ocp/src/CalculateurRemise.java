public class CalculateurRemise {

    public double calculerTotal(Client client, double montant) {
        return client.appliquerRemise(montant);
    }
}
