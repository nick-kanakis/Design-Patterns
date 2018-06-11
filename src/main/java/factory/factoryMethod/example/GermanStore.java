package factory.factoryMethod.example;

/**
 * Created by Nicolas on 3/6/2018.
 */
public class GermanStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if(type.equals("german")){
            return new GermanPizza();
        }
        System.out.println("We only create german pizzas here!");
        return null;
    }
}
