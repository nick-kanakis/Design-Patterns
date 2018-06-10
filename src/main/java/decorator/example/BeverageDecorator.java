package decorator.example;

/**
 * Created by Nicolas on 2/6/2018.
 */
abstract public class BeverageDecorator implements Beverage {
    final Beverage decoratedBeverage;

    BeverageDecorator(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    @Override
    public String printDescription() {
        return decoratedBeverage.printDescription();
    }

    @Override
    public double getCost() {
       return decoratedBeverage.getCost();
    }
}
