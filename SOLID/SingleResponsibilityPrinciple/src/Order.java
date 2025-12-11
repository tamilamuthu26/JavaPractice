public class Order {
    private int id;
    private String itemName;
    private double amount;

    public Order(int id, String itemName, double amount) {
        this.id = id;
        this.itemName = itemName;
        this.amount = amount;
    }

    public int getId() { return id; }
    public String getItemName() { return itemName; }
    public double getAmount() { return amount; }
}
