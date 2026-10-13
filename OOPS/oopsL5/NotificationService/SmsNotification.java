package OOPS.oopsL5.NotificationService;

public class SmsNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
