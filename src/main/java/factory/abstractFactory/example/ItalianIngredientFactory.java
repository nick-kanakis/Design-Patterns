package factory.abstractFactory.example;

import factory.abstractFactory.example.ingredients.BBQSauce;
import factory.abstractFactory.example.ingredients.Cheese;
import factory.abstractFactory.example.ingredients.Mozzarella;
import factory.abstractFactory.example.ingredients.Sauce;

/**
 * Created by Nicolas on 3/6/2018.
 */
public class ItalianIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new BBQSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }
}
