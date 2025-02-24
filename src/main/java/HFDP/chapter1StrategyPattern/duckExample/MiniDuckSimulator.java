package HFDP.chapter1StrategyPattern.duckExample;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new Quack());
        mallard.performFly();
        mallard.performQuack();
    }
}
