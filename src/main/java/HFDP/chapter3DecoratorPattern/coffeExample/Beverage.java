package HFDP.chapter3DecoratorPattern.coffeExample;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public enum Size {TALL, GRANDE, VENTI};
    private Size size;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return this.size == null ? Size.TALL : this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
