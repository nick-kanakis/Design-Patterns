package decorator.example;

/**
 * Created by Nicolas on 2/6/2018.
 */
public class FrenchCoffee implements Beverage{
    @Override
    public String printDescription() {
         return "This is a french Coffee.";
    }

    @Override
    public double getCost() {
        return 0.99;
    }
}
