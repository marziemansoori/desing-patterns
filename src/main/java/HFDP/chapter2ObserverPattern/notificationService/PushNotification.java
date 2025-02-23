package HFDP.chapter2ObserverPattern.notificationService;

//import org.springframework.stereotype.Component;

//@Component
public class PushNotification implements NotificationObserver {
    @Override
    public void update(String message) {
        System.out.println("🔔 Push notification sent: " + message);
    }
}
