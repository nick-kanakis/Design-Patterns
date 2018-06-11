package factory.factoryMethod.example;

/**
 * Created by Nicolas on 3/6/2018.
 */
public class GreekStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if(type.equals("greek")){
            return new GreekPizza();
        }
        System.out.println("We only create greek pizzas here!");
        return null;
    }
}
