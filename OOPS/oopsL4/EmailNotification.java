package OOPS.oopsL4;

public class EmailNotification implements Notification{
    private String message;

    EmailNotification(String message){
        this.message = message;
    }
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
