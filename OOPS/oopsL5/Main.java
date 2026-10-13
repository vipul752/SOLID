package OOPS.oopsL5;

import OOPS.oopsL4.EmailNotification;
import OOPS.oopsL4.Notification;
import OOPS.oopsL4.SMSNotification;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Vipul");
        BankAccount account = new BankAccount("ACC101");
        AccountAccess access = new AccountAccess(customer, account);

        Notification sender = new SMSNotification();
        BankingService bankingService  = new BankingService(sender);

        bankingService.depositCompleted(1000);
        access.showDetails();

    }
}
