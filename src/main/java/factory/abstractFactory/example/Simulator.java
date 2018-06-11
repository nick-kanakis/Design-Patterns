package factory.abstractFactory.example;



/**
 * Created by Nicolas on 3/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        Pizza greekStore = new Pizza(new GreekIngredientFactory());
        Pizza italianStore = new Pizza(new ItalianIngredientFactory());

        System.out.println("Greek pizza order");
        greekStore.prepare();
        greekStore.bake();
        greekStore.box();

        System.out.println("Italian pizza order");
        italianStore.prepare();
        italianStore.bake();
        italianStore.box();
    }
}
