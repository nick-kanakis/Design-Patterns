package strategy.example;

/**
 * Created by Nicolas on 1/6/2018.
 */
public class MallardDuck extends  Duck {

    MallardDuck(){
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public String display() {
        return "This is a Mallard Duck.";
    }
}
