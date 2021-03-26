package Task8.observer;

public class CurrentConditionDisplay implements Observer{
    private float temp;
    private float humid;
    private int pressure;


    @Override
    public void update(float temp, float humid, int pressure) {
        this.temp = temp;
        this.humid = humid;
        this.pressure = pressure;
        display();

    }

    public void display(){
        System.out.printf("Сейчас значения:%.1f градусов цельсия и %.1f %% влажности. Давление %d мм рт. ст.\n", temp, humid, pressure);
    }
}
