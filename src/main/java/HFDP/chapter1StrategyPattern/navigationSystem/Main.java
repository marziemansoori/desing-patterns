package HFDP.chapter1StrategyPattern.navigationSystem;

public class Main {
    public static void main(String[] args) {
        NavigationApp app = new NavigationApp();

        app.setStrategy(new FastestRoute());
        app.navigate("Home", "Office"); // Calculating fastest route from Home to Office

        app.setStrategy(new ScenicRoute());
        app.navigate("Home", "Office"); // Calculating scenic route from Home to Office
    }
}