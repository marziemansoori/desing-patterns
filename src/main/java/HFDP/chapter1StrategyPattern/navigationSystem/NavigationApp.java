package HFDP.chapter1StrategyPattern.navigationSystem;

class NavigationApp {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(String origin, String destination) {
        strategy.calculateRoute(origin, destination);
    }
}