class DeliveryService implements OrderDelivery {

    @Override
    public void deliverOrder() {
        System.out.println("Order delivered to customer.");
    }
}
