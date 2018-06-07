package strategy.example;

/**
 * Created by Nicolas on 1/6/2018.
 */
public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "Quack!!!";
    }
}
