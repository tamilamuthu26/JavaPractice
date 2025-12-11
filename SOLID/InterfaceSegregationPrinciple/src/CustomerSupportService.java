class CustomerSupportService implements
        OrderCancellation, OrderReturn, OrderExchange {

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled successfully.");
    }

    @Override
    public void returnOrder() {
        System.out.println("Order return initiated.");
    }

    @Override
    public void exchangeOrder() {
        System.out.println("Order exchange requested.");
    }
}
