public class PaypalPaymentProcessor implements PaymentProcessor {

    @Override
    public void process(Payment payment) {
        System.out.println("Processing PayPal payment of ₹" + payment.getAmount());
        System.out.println("Redirecting to PayPal...");
        System.out.println("Payment successful via PayPal.");
    }
}
