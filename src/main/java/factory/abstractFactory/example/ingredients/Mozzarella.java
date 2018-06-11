package factory.abstractFactory.example.ingredients;

/**
 * Created by Nicolas on 4/6/2018.
 */
public class Mozzarella implements Cheese {
    @Override
    public String cheeseType() {
        return "Mozzarella cheese";
    }
}
