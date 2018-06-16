package facade.example;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class Heater {

    public String on(){
        return "Heater is On";
    }

    public String off(){
        return "Heater is Off";
    }

    public String setTemperature(int temperature){
        return "Temperature is set to: "+ temperature;
    }
}
