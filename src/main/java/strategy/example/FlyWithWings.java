package strategy.example;

/**
 * Created by Nicolas on 1/6/2018.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public String fly() {
        return "I can fly with my wings.";
    }
}
