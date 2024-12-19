package adapter.without;

class OldSystem {
    public void processOldPayment(String customerName, double amount) {
        System.out.println("Processing payment for " + customerName + " in the Old System. Amount: " + amount);
    }
}

class NewSystem {
    public void processNewPayment(String customerId, double amount) {
        System.out.println("Processing payment for Customer ID: " + customerId + " in the New System. Amount: " + amount);
    }
}

public class BadExampleWithoutAdapter {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        oldSystem.processOldPayment("John Doe", 100.50);

        NewSystem newSystem = new NewSystem();
        newSystem.processNewPayment("12345", 200.75);
    }
}

