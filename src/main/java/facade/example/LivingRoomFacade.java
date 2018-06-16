package facade.example;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class LivingRoomFacade {
    private Heater heater;
    private Lights lights;
    private TV tv;

    public LivingRoomFacade(Heater heater, Lights lights, TV tv) {
        this.heater = heater;
        this.lights = lights;
        this.tv = tv;
    }

    public void hyggeMode(){
        System.out.println(lights.off());
        System.out.println(heater.on());
        System.out.println(heater.setTemperature(20));
        System.out.println(tv.on());
        System.out.println(tv.watchMovie("Lord of the Ring trilogy"));
    }

    public void sleepMode(){
        System.out.println(lights.off());
        System.out.println(heater.on());
        System.out.println(heater.setTemperature(15));
        System.out.println(tv.off());
    }

}
