package observer.example;

/**
 * Created by Nicolas on 2/6/2018.
 */
public class Forecast implements Observer {
    private Subject subject;

    public Forecast(Subject subject) {
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

            if (humidity > 80 && temperature < 20) {
                System.out.println("Forecast: It will rain soon");
            } else {
                System.out.println("Forecast: It looks sunny!");
            }
        }
    }
}
