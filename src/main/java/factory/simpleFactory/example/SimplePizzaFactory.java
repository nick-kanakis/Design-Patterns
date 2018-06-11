package factory.simpleFactory.example;

/**
 * Created by Nicolas on 3/6/2018.
 */
public final class SimplePizzaFactory {

    public Pizza createPizza(String type){
        if(type.equals("greek")){
            return new GreekPizza();
        } else if(type.equals("german")) {
            return new GermanPizza();
        }
        return null;
    }
}
