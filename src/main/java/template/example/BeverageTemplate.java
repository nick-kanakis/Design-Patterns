package template.example;

/**
 * Created by Nicolas on 9/6/2018.
 */
public abstract class BeverageTemplate {

    public final void prepareBeverage(){
        System.out.println(boilWater());
        System.out.println(brew());
        System.out.println(pourInCup());
        System.out.println(addCondiments());
    }

    protected String boilWater(){
        return "Boiling water...";
    }

    protected String pourInCup(){
        return "Pouring beverage to cup";
    }

    protected abstract String brew();
    protected abstract String addCondiments();
}
