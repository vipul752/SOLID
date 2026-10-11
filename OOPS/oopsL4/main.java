package OOPS.oopsL4;

public class main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notification email = new EmailNotification("Hello, this is an email notification.");

        service.NotifyUser(email, "Hello, this is an email notification1.");

    }
}
