public class PushMessageSender implements MessageSender {

    @Override
    public void envoyer(String message) {
        System.out.println("Notification push envoyée : " + message);
    }
}

