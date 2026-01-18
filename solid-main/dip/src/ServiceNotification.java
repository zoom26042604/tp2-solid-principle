public class ServiceNotification {

    private MessageSender messageSender;

    public ServiceNotification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void envoyerMessage(String message) {
        messageSender.envoyer(message);
    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
}

