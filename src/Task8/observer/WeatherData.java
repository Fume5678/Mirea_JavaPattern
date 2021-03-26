package Task8.observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherData implements Observable{
    private List<Observer> observers;
    private float temp;
    private float humid;
    private int pressure;

    public WeatherData() {
        observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObject(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers){
            observer.update(temp, humid, pressure);
        }
    }

    public void setMeasure(float temp, float humid, int pressure){
        this.temp = temp;
        this.humid = humid;
        this.pressure = pressure;
    }
}
