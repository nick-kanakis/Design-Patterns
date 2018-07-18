package template.example;

/**
 * Created by Nicolas on 9/6/2018.
 */
public class Tea extends BeverageTemplate {
    @Override
    protected String brew() {
        return "Steep the teabag";
    }

    @Override
    protected String addCondiments() {
        return "Add lemon";
    }
}
