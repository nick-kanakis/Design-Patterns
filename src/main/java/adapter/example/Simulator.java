package adapter.example;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Turkey fakeTurkey = new TurkeyAdapter(mallard);
        System.out.println(fakeTurkey.fly());
        System.out.println(fakeTurkey.gobble());
    }
}
