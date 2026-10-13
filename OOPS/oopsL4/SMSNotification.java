package OOPS.oopsL4;

public class SMSNotification implements Notification{
    private String message;

    public SMSNotification(){
        this.message = message;
    }
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
