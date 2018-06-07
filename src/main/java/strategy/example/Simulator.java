package strategy.example;

/**
 * Created by Nicolas on 1/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        Duck actualDuck = new MallardDuck();
        Duck toy = new RubberDuck();

        System.out.println(actualDuck.display());
        System.out.println(actualDuck.performFly());
        System.out.println(actualDuck.performQuack());

        System.out.println(toy.display());
        System.out.println(toy.performFly());
        System.out.println(toy.performQuack());

        System.out.println("The mallard duck is hurt it cannot fly any more");
        System.out.println("The toy duck is fitted with a sound device to quack");

        actualDuck.setFlyBehavior(new FlyNoWay());
        toy.setQuackBehavior(new Quack());


        System.out.println(actualDuck.display());
        System.out.println(actualDuck.performFly());
        System.out.println(actualDuck.performQuack());

        System.out.println(toy.display());
        System.out.println(toy.performFly());
        System.out.println(toy.performQuack());


    }
}
