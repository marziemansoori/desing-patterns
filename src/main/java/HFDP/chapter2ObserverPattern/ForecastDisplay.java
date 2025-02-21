package HFDP.chapter2ObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.9F;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: " + currentPressure + "F degrees and " + lastPressure + "% humidity");
    }

    @Override
    public void update() {
        this.currentPressure = weatherData.getPressure();
        lastPressure = currentPressure;
        display();
    }
}
