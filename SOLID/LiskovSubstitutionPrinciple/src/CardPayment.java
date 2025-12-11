public class CardPayment implements Payment, Refundable {

    @Override
    public void pay(double amount) {
        System.out.println("Card payment processed: ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund issued to card: ₹" + amount);
    }
}
