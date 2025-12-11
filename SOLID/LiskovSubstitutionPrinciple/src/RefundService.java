public class RefundService {

    public void issueRefund(Refundable payment, double amount) {
        payment.refund(amount);
    }
}
