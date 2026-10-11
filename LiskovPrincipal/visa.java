package LiskovPrincipal;

public class visa extends CreditCard implements InternationalCompatibleCreditCard {
    @Override
    public void swipeAndPay() {
        System.out.println("Visa card swipe and pay");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Visa card tap and pay");
    }


    @Override
    public void internationalPayment() {
        System.out.println("Visa card international payment");
    }
}
