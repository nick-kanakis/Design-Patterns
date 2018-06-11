package factory.factoryMethod.example;

/**
 * Created by Nicolas on 3/6/2018.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        if(pizza == null){
            System.out.println("Wrong order");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
