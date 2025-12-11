class NotificationService {

    private final MessageService service;

    public NotificationService(MessageService service) {   // ✔ Constructor Injection
        this.service = service;
    }

    public void notifyUser(String message) {
        service.sendMessage(message);
    }
}
