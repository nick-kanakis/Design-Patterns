package decorator.example;

import decorator.example.Beverage;

/**
 * Created by Nicolas on 2/6/2018.
 */
public class Espresso implements Beverage {
    @Override
    public String printDescription() {
        return "This is a espresso costs.";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
