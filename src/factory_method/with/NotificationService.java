package factory_method.with;

abstract class Notification {
    abstract void send();
}

class SMSNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending SMS notification...");
    }
}

class EmailNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending Email notification...");
    }
}

abstract class NotificationFactory {
    abstract Notification createNotification();
}

class SMSNotificationFactory extends NotificationFactory {

    @Override
    Notification createNotification() {
        return new SMSNotification();
    }
}

class EmailNotificationFactory extends NotificationFactory {

    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}

public class NotificationService {

    public static void main(String[] args) {

        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification email = emailFactory.createNotification();
        email.send();

        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification sms = smsFactory.createNotification();
        sms.send();
    }
}
