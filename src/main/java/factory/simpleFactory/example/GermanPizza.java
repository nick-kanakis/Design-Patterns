package factory.simpleFactory.example;

/**
 * Created by Nicolas on 3/6/2018.
 */
public class GermanPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("German pizza is prepared with meatballs and sausages");
    }
}