package factory.abstractFactory.example;

import factory.abstractFactory.example.ingredients.Cheese;
import factory.abstractFactory.example.ingredients.Feta;
import factory.abstractFactory.example.ingredients.Sauce;
import factory.abstractFactory.example.ingredients.TomatoSauce;

/**
 * Created by Nicolas on 3/6/2018.
 */
public class GreekIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Feta();
    }
}
