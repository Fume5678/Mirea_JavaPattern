package Task8;

import Task8.observer.CurrentConditionDisplay;
import Task8.observer.Observer;
import Task8.observer.WeatherData;

public class main {
    public static void main(String[] args) {
        // Observer
        WeatherData weatherData = new WeatherData();
        Observer observer = new CurrentConditionDisplay();

        weatherData.registerObserver(observer);
        weatherData.setMeasure(12, 32, 32);
        weatherData.setMeasure(22, 12, 54);
        weatherData.notifyObserver();


    }
}
