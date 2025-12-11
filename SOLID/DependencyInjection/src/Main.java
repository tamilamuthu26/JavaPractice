public class Main {
    public static void main(String[] args) {

        MessageService email = new EmailService();
        MessageService sms = new SmsService();
        MessageService whatsapp = new WhatsAppService();

        NotificationService service1 = new NotificationService(email);
        NotificationService service2 = new NotificationService(sms);
        NotificationService service3 = new NotificationService(whatsapp);

        service1.notifyUser("Order placed successfully!");
        service2.notifyUser("Your OTP is 987654");
        service3.notifyUser("Your package is arriving today");
    }
}
