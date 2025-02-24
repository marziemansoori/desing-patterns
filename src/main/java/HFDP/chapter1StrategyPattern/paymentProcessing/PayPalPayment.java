package HFDP.chapter1StrategyPattern.paymentProcessing;

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via PayPal.");
    }
}