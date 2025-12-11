public class Payment {
    private String type;       // CARD, UPI, PAYPAL
    private double amount;

    public Payment(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
