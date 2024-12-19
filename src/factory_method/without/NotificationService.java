package factory_method.without;

import java.util.Scanner;

class Notification {
    public void send() {
        System.out.println("Sending a generic notification...");
    }
}

class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending an Email notification...");
    }
}

class SMSNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending an SMS notification...");
    }
}

public class NotificationService {
    public static void main(String[] args) {
        Notification notification;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of notification (Email or SMS):");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("Email")) {
            notification = new EmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            notification = new SMSNotification();
        } else {
            notification = new Notification();
        }

        notification.send();
    }
}
