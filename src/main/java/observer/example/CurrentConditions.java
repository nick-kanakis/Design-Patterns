package observer.example;

/**
 * Created by Nicolas on 2/6/2018.
 */
public class CurrentConditions implements Observer {
    Subject subject;

    public CurrentConditions(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void unregister(){
        subject.unregisterObserver(this);
    }

    @Override
    public void update(Subject s) {
        if (s instanceof WeatherData) {
            WeatherData wd = (WeatherData) s;

            //Pull data
            int humidity = wd.getHumidity();
            int temperature = wd.getTemperature();
            int pressure = wd.getPressure();

            System.out.println("Current Conditions: ");
            System.out.println("Humidity: " + humidity );
            System.out.println("Temperature: "+ temperature);
            System.out.println("Pressure: "+ pressure);
        }
    }
}
