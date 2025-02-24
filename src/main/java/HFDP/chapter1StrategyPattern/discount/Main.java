package HFDP.chapter1StrategyPattern.discount;

public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        checkout.setStrategy(new PercentageDiscount(10)); // 10% discount
        System.out.println("Final Price: " + checkout.finalPrice(100)); // Final Price: 90.0

        checkout.setStrategy(new FixedAmountDiscount(20)); // $20 discount
        System.out.println("Final Price: " + checkout.finalPrice(100)); // Final Price: 80.0
    }
}