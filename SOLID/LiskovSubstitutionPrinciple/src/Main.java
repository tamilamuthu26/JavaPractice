//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Payment card= new CardPayment();
        Payment upi= new UpiPayment();
        Payment cod= new CashOnDeliveryPayment();

        RefundService refundService= new RefundService();
        card.pay(1000);
        upi.pay(200);
        cod.pay(10000);


        System.out.println("-----Refund Operations------");
        refundService.issueRefund((Refundable) card,300);
        refundService.issueRefund((Refundable) upi,800);
       // refundService.issueRefund((Refundable) cod,100); -> cause compile time error
        // ❌ COD is not added — not refundable (LSP preserved)

    }
}