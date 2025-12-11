public class OrderRepository {

    public void save(Order order) {
        System.out.println("Order saved to database → ID: " + order.getId());
    }
}
