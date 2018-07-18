package template.example;

/**
 * Created by Nicolas on 9/6/2018.
 */
public class Coffee extends BeverageTemplate {
    @Override
    protected String brew() {
        return "Brew coffee grinds";
    }

    @Override
    protected String addCondiments() {
        return "Add mil & sugar";
    }
}
