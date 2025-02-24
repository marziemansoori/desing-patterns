package HFDP.chapter1StrategyPattern.paymentProcessing;


public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.executePayment(100); // Paid 100 via Credit Card.

        context.setStrategy(new PayPalPayment());
        context.executePayment(50); // Paid 50 via PayPal.
    }
}