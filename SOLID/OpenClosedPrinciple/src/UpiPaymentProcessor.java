public class UpiPaymentProcessor implements PaymentProcessor {

    @Override
    public void process(Payment payment) {
        System.out.println("Processing UPI payment of ₹" + payment.getAmount());
        System.out.println("Sending UPI request...");
        System.out.println("Payment successful via UPI.");
    }
}
