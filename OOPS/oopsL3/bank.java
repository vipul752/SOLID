package OOPS.oopsL3;

public class bank implements payment{
    private int Balance;

    bank(int initialBalance){
        if(initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        Balance = initialBalance;
    }

    void Deposit(int amount){
        if(amount < 0){
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        }

        Balance+=amount;
    }

    void showDetails() {
        System.out.println("Balance: " + Balance);
    }

    @Override
    public boolean pay(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Payment amount cannot be negative");
        }
        if (amount > Balance) {
            return false;
        }
        Balance -= amount;
        System.out.println("Payment of " + amount + " successful. New balance: " + Balance);
        return true;
    }

    public static void main(String[] args){
        bank account = new bank(1000);
        account.showDetails();
        account.pay(500);
    }

}

