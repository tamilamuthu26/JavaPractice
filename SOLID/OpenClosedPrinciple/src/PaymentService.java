    import java.util.Map;

    public class PaymentService {

        private final Map<String, PaymentProcessor> registry;

        public PaymentService(Map<String, PaymentProcessor> registry) {
            this.registry = registry;
        }

        public void process(Payment payment) {
            PaymentProcessor processor = registry.get(payment.getType());

            if (processor == null) {
                throw new IllegalArgumentException("No processor found for: " + payment.getType());
            }

            processor.process(payment);
        }
    }
