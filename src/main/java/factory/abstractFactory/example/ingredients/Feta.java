package factory.abstractFactory.example.ingredients;

/**
 * Created by Nicolas on 4/6/2018.
 */
public class Feta implements Cheese {
    @Override
    public String cheeseType() {
        return "Feta cheese";
    }
}
