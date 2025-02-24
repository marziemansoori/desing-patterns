package HFDP.chapter1StrategyPattern.paymentProcessing;

class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via Credit Card.");
    }
}