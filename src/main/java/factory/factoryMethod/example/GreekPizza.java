package factory.factoryMethod.example;

/**
 * Created by Nicolas on 3/6/2018.
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Greek pizza is prepared with olive oil and onions");
    }
}
