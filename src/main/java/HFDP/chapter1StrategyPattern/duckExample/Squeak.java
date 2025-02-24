package HFDP.chapter1StrategyPattern.duckExample;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
