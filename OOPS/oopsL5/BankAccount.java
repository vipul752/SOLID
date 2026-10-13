package OOPS.oopsL5;

public class BankAccount {
    private final String accountNumber;

    BankAccount(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}
