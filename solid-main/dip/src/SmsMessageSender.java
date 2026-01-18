public class SmsMessageSender implements MessageSender {

    @Override
    public void envoyer(String message) {
        System.out.println("SMS envoyé : " + message);
    }
}

