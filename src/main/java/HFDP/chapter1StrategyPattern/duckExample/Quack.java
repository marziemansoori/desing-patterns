package HFDP.chapter1StrategyPattern.duckExample;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
