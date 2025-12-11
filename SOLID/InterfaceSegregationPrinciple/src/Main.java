public class Main {
    public static void main(String[] args) {

        CustomerSupportService customerSupport = new CustomerSupportService();
        WarehouseService warehouse = new WarehouseService();
        DeliveryService delivery = new DeliveryService();
        RefundService refund = new RefundService();

        customerSupport.cancelOrder();
        customerSupport.returnOrder();

        warehouse.shipOrder();

        delivery.deliverOrder();

        refund.processRefund();
    }
}
