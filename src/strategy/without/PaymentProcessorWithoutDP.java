package strategy.without;

public class PaymentProcessorWithoutDP {
    public void processPayment(String method, double amount) {
        if ("CreditCard".equalsIgnoreCase(method)) {
            System.out.println("Processing credit card payment of $" + amount);
        } else if ("PayPal".equalsIgnoreCase(method)) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else {
            System.out.println("Invalid payment method");
        }
    }

    public static void main(String[] args) {
        PaymentProcessorWithoutDP processor = new PaymentProcessorWithoutDP();
        processor.processPayment("CreditCard", 100.0);
        processor.processPayment("PayPal", 50.0);
    }
}
