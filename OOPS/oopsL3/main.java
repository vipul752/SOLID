package OOPS.oopsL3;

public class main {
    static void main(String[] args) {
        payment2 payment;

        payment = new upiPayment();
        payment.pay(1000);

        payment = new creditPayment();
        payment.pay(2000);

        payment = new payment2();
        payment.pay(3000);
    }
}
