package HFDP.chapter2ObserverPattern.notificationService;

//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Configuration;

//@Configuration
//@ConfigurationProperties(prefix = "notification")
public class NotificationConfig {
    private boolean email;
    private boolean sms;
    private boolean push;

    public boolean isEmail() { return email; }
    public void setEmail(boolean email) { this.email = email; }

    public boolean isSms() { return sms; }
    public void setSms(boolean sms) { this.sms = sms; }

    public boolean isPush() { return push; }
    public void setPush(boolean push) { this.push = push; }
}
