public class CashOnDeliveryPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("COD amount collected at delivery: ₹" + amount);
    }
}
