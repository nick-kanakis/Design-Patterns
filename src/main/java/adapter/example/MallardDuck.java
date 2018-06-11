package adapter.example;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class MallardDuck implements Duck {
    @Override
    public String quack() {
        return "Quaack!";
    }

    @Override
    public String fly() {
        return "I am flying";
    }
}
