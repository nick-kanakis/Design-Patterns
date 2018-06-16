package facade.example;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        LivingRoomFacade facade = new LivingRoomFacade(new Heater(), new Lights(), new TV());
        System.out.println("Hygge Mode");
        facade.hyggeMode();
        System.out.println("Sleep Mode");
        facade.sleepMode();
    }
}
