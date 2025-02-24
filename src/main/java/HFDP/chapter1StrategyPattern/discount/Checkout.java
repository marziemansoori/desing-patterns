package HFDP.chapter1StrategyPattern.discount;

class Checkout {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double finalPrice(double price) {
        return strategy.applyDiscount(price);
    }
}
