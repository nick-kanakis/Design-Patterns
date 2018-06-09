package observer.example;

/**
 * Created by Nicolas on 2/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        Forecast forecastObserver = new Forecast(wd);

        wd.updateValues(50, 21, 78);
        wd.updateValues(80, 15, 81);
        System.out.println("Forecast is unsubscribing!!");
        forecastObserver.unregister();
        wd.updateValues(50, 35, 90);
    }
}
