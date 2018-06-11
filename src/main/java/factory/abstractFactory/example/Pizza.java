package factory.abstractFactory.example;

import factory.abstractFactory.example.ingredients.Cheese;
import factory.abstractFactory.example.ingredients.Sauce;

/**
 * Created by Nicolas on 3/6/2018.
 */
public class Pizza {
    Sauce sauce;
    Cheese cheese;
    PizzaIngredientFactory ingredientFactory;

    public Pizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();

        System.out.println("Pizzas Ingredients are: ");
        System.out.println("Sauce "+sauce.sauceType());
        System.out.println("Cheese "+cheese.cheeseType());
    }


    public void bake(){
        System.out.println("The pizza is in the oven");
    }

    public void box(){
        System.out.println("The pizza is in the box");
    }
}
