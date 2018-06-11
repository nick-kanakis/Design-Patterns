package factory.abstractFactory.example;

import factory.abstractFactory.example.ingredients.Cheese;
import factory.abstractFactory.example.ingredients.Sauce;

/**
 * Created by Nicolas on 3/6/2018.
 */
public interface PizzaIngredientFactory {
    Sauce createSauce();
    Cheese createCheese();
}
