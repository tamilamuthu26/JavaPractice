public class Main {
    public static void main(String[] args) {

        Order order = new Order(101, "Laptop", 56000);

        OrderValidator validator = new OrderValidator();
        OrderRepository repository = new OrderRepository();
        PaymentService paymentService = new PaymentService();
        EmailService emailService = new EmailService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        OrderService orderService = new OrderService(
                validator,
                repository,
                paymentService,
                emailService,
                invoiceGenerator
        );

        orderService.processOrder(order);
    }
}
