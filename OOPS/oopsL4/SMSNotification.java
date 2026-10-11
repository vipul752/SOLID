package OOPS.oopsL4;

public class SMSNotification implements Notification{
    private String message;

    SMSNotification(String message){
        this.message = message;
    }
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
