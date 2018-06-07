package strategy.example;

/**
 * Created by Nicolas on 1/6/2018.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    public String display() {
        return "This is a toy duck";
    }
}
