package HFDP.chapter1StrategyPattern.duckExample;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with no way");
    }
}
