package OOPS.oopsL4;

public class NotificationService {
    public void NotifyUser(Notification notification,String message){
        notification.send(message);
    }
}
