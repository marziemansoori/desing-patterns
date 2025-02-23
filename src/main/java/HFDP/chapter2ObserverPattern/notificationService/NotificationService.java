package HFDP.chapter2ObserverPattern.notificationService;

//import org.springframework.stereotype.Service;
//import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

//@Service
public class NotificationService {
    private final List<NotificationObserver> observers = new ArrayList<>();
    private final NotificationConfig config;
    private final EmailNotification emailNotification;
    private final SmsNotification smsNotification;
    private final PushNotification pushNotification;

    public NotificationService(NotificationConfig config, 
                               EmailNotification emailNotification, 
                               SmsNotification smsNotification, 
                               PushNotification pushNotification) {
        this.config = config;
        this.emailNotification = emailNotification;
        this.smsNotification = smsNotification;
        this.pushNotification = pushNotification;
    }

//    @PostConstruct
    public void init() {
        if (config.isEmail()) subscribe(emailNotification);
        if (config.isSms()) subscribe(smsNotification);
        if (config.isPush()) subscribe(pushNotification);
    }

    public void subscribe(NotificationObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(NotificationObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (NotificationObserver observer : observers) {
            observer.update(message);
        }
    }
}
