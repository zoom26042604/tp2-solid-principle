public class ImprimanteScanneur implements Imprimante, Scanneur {

    @Override
    public void imprimer() {
        System.out.println("Impression en cours...");
    }

    @Override
    public void scanner() {
        System.out.println("Scan en cours...");
    }
}

