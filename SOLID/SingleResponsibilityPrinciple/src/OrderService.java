public class OrderService {

    private OrderValidator validator;
    private OrderRepository repository;
    private PaymentService paymentService;
    private EmailService emailService;
    private InvoiceGenerator invoiceGenerator;

    //dependency injection
    public OrderService(OrderValidator validator, OrderRepository repository,
                        PaymentService paymentService, EmailService emailService,
                        InvoiceGenerator invoiceGenerator) {

        this.validator = validator;
        this.repository = repository;
        this.paymentService = paymentService;
        this.emailService = emailService;
        this.invoiceGenerator = invoiceGenerator;
    }

    public void processOrder(Order order) {
        System.out.println("=== ORDER PROCESSING STARTED ===");

        validator.validate(order);
        paymentService.processPayment(order.getAmount());
        repository.save(order);
        invoiceGenerator.generateInvoice(order);
        emailService.sendConfirmationEmail(order);

        System.out.println("=== ORDER PROCESSING COMPLETED ===");
    }
}
