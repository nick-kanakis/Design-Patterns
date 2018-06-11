package factory.simpleFactory.example;

/**
 * Created by Nicolas on 3/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {

        PizzaStore ps = new PizzaStore(new SimplePizzaFactory());
        ps.orderPizza("greek");
        ps.orderPizza("german");
    }
}
