import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // registry configuration
        Map<String, PaymentProcessor> registry = new HashMap<>();
        registry.put("CARD", new CardPaymentProcessor());
        registry.put("UPI", new UpiPaymentProcessor());
        registry.put("PAYPAL", new PaypalPaymentProcessor());

        PaymentService paymentService = new PaymentService(registry);

        // test calls
        paymentService.process(new Payment("CARD", 1000));
        System.out.println("-----------");

        paymentService.process(new Payment("UPI", 500));
        System.out.println("-----------");

        paymentService.process(new Payment("PAYPAL", 2500));
    }
}
