package OOPS.oopsL3;

public class creditPayment extends payment2{
    @Override
    public void pay(int amount) {
        System.out.println("Credit card payment of " + amount);
    }
}
