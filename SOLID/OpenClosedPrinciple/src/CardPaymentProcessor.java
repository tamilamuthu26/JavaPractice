public class CardPaymentProcessor implements PaymentProcessor {

    @Override
    public void process(Payment payment) {
        System.out.println("Processing CARD payment of ₹" + payment.getAmount());
        System.out.println("Validating card details...");
        System.out.println("Payment successful via CARD.");
    }
}
