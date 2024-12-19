package adapter.with;

interface OldSystem {
    void processOldPayment(String customerName, double amount);
}

class OldSystemImpl implements OldSystem {
    public void processOldPayment(String customerName, double amount) {
        System.out.println("Processing payment for " + customerName + " in the Old System. Amount: " + amount);
    }
}

class NewSystem {
    public void processNewPayment(int customerId, double amount) {
        System.out.println("Processing payment for Customer ID: " + customerId + " in the New System. Amount: " + amount);
    }
}

class NewSystemAdapter implements OldSystem {

    private NewSystem newSystem;

    public NewSystemAdapter(NewSystem system) {
        this.newSystem = system;
    }

    @Override
    public void processOldPayment(String customerName, double amount) {
        int customerId = customerName.hashCode();

        newSystem.processNewPayment(customerId, amount);
    }
}


public class PaymentClientWithAdapter {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystemImpl();
        oldSystem.processOldPayment("Elena", 150.00);

        NewSystem newSystem = new NewSystem();
        OldSystem adapter = new NewSystemAdapter(newSystem);

        adapter.processOldPayment("Elena", 200.00);
    }
}
