package HFDP.chapter1StrategyPattern.navigationSystem;

class ScenicRoute implements RouteStrategy {
    @Override
    public void calculateRoute(String origin, String destination) {
        System.out.println("Calculating scenic route from " + origin + " to " + destination);
    }
}