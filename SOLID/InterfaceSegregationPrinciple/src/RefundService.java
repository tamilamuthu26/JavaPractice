class RefundService implements OrderRefund {

    @Override
    public void processRefund() {
        System.out.println("Refund processed to customer.");
    }
}
