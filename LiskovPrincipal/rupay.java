package LiskovPrincipal;

public class rupay extends CreditCard implements UpiCompatibleCreditCard{

    @Override
    public void swipeAndPay() {
        System.out.println("Rupay card swipe and pay");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Rupay card tap and pay");
    }

    @Override
    public void upiPayment() {
        System.out.println("Rupay card upi payment");
    }
}
