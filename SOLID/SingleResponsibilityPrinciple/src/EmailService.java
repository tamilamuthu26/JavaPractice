public class EmailService {

    public void sendConfirmationEmail(Order order) {
        System.out.println("Confirmation email sent → Order ID: " + order.getId());
    }
}
