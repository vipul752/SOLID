package OOPS.oopsL5;

public class AccountAccess {
    private final Customer customer;
    private final BankAccount bankAccount;


    AccountAccess(Customer customer,BankAccount bankAccount){
        this.bankAccount = bankAccount;
        this.customer= customer;
    }

    public void showDetails(){
        System.out.println("customer detail : " + customer.getName());
        System.out.println("account detail : " + bankAccount.getAccountNumber());
    }

}
