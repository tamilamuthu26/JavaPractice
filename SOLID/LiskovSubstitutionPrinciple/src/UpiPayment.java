public class UpiPayment implements Payment, Refundable {

    @Override
    public void pay(double amount) {
        System.out.println("UPI payment processed: ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund issued to UPI ID: ₹" + amount);
    }
}
