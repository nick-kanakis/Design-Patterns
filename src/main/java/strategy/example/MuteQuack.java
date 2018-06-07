package strategy.example;

/**
 * Created by Nicolas on 1/6/2018.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "I cannot quack";
    }
}
