package HFDP.chapter3DecoratorPattern.coffeExample;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.GRANDE);
        System.out.println(beverage.getSize() + ", " +  beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getSize() + ", " + beverage2.getDescription() + " $" + beverage2.cost());
    }
}
