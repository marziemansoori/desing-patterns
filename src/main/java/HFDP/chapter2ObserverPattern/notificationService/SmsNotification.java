package HFDP.chapter2ObserverPattern.notificationService;

//import org.springframework.stereotype.Component;

//@Component
public class SmsNotification implements NotificationObserver {
    @Override
    public void update(String message) {
        System.out.println("📱 SMS sent: " + message);
    }
}
