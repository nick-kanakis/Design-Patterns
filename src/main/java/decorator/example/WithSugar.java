package decorator.example;

/**
 * Created by Nicolas on 2/6/2018.
 */
public class WithSugar extends BeverageDecorator {

    WithSugar(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String printDescription() {
        return decoratedBeverage.printDescription() +"\n Added sugar.";
    }

    @Override
    public double getCost() {
        return decoratedBeverage.getCost() + 0.05;
    }
}
