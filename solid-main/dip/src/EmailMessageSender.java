public class EmailMessageSender implements MessageSender {

    @Override
    public void envoyer(String message) {
        System.out.println("Email envoyé : " + message);
    }
}

