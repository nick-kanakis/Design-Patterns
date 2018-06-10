package decorator.example;

/**
 * Created by Nicolas on 2/6/2018.
 */
public class WithMilk extends BeverageDecorator {

    public WithMilk(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String printDescription() {
         return decoratedBeverage.printDescription() +"\n Added milk.";
    }

    @Override
    public double getCost() {

        return decoratedBeverage.getCost() + 0.1;
    }
}
