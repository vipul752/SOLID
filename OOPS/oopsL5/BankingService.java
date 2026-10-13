package OOPS.oopsL5;

import OOPS.oopsL4.Notification;

public class BankingService {
    private final Notification sender;

    public BankingService(Notification sender) {
        this.sender = sender;
    }

    public void depositCompleted(int amount){
        sender.send("Deposited Successful" + amount);
    }
}
