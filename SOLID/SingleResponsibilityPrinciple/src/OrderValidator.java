public class OrderValidator {

    public void validate(Order order) {
        if (order.getAmount() <= 0) {
            throw new IllegalArgumentException("Order amount must be greater than 0!");
        }

        if (order.getItemName() == null || order.getItemName().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be empty!");
        }

        System.out.println("Order validated successfully.");
    }
}
