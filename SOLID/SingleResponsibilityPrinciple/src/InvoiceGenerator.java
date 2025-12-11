public class InvoiceGenerator {

    public void generateInvoice(Order order) {
        System.out.println("Invoice generated → Item: " + order.getItemName()
                + ", Amount: ₹" + order.getAmount());
    }
}
