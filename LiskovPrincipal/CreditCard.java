package LiskovPrincipal;

public abstract class CreditCard {

    private int cardNumber;
    private int cvv;
    private String ownerName;

    //getter
    public void getCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }

    public void getOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public abstract void tapAndPay();

    public abstract void swipeAndPay();

    public void displayCardDetails(){
        System.out.println("Card Number" + this.cardNumber + "Owner Name" + this.ownerName);
    };
}
