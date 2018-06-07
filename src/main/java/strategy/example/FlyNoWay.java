package strategy.example;

/**
 * Created by Nicolas on 1/6/2018.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "Sorry I cannot fly";
    }
}
