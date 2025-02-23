package HFDP.chapter2ObserverPattern.notificationService;

//import org.springframework.stereotype.Component;

//@Component
public class EmailNotification implements NotificationObserver {
    @Override
    public void update(String message) {
        System.out.println("📧 Email sent: " + message);
    }
}
