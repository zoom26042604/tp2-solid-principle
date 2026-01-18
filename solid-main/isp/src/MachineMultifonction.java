public class MachineMultifonction implements Imprimante, Scanneur, Fax {

    @Override
    public void imprimer() {
        System.out.println("Impression en cours...");
    }

    @Override
    public void scanner() {
        System.out.println("Scan en cours...");
    }

    @Override
    public void faxer() {
        System.out.println("Fax envoyé...");
    }
}

