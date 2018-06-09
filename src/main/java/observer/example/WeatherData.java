package observer.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nicolas on 2/6/2018.
 */
public class WeatherData implements Subject {
    private int humidity;
    private int temperature;
    private int pressure;

    private Set<Observer> observers;

    public WeatherData() {
        this.observers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers ) {
            o.update(this);
        }
    }

    public void updateValues(int humidity, int temperature, int pressure){
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    public int getHumidity() {
        return humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }
}
