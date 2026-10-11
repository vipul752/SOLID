package OOPS.oopsL4;

public class PushNotification implements Notification{
    private String message;

    PushNotification(String message){
        this.message = message;
    }
    @Override
    public void send(String message) {
        System.out.println("Push Notification sent: " + message);
    }
}
