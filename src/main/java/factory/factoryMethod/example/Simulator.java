package factory.factoryMethod.example;

/**
 * Created by Nicolas on 3/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        PizzaStore greekStore = new GreekStore();
        PizzaStore germanStore = new GermanStore();

        greekStore.orderPizza("greek");
        germanStore.orderPizza("german");
        greekStore.orderPizza("german");
    }
}
