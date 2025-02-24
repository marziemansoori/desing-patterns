package HFDP.chapter1StrategyPattern.navigationSystem;

class FastestRoute implements RouteStrategy {
    @Override
    public void calculateRoute(String origin, String destination) {
        System.out.println("Calculating fastest route from " + origin + " to " + destination);
    }
}