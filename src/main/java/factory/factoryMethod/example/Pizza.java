package factory.factoryMethod.example;

/**
 * Created by Nicolas on 3/6/2018.
 */
public abstract class Pizza {
    abstract public void prepare();

    public void bake(){
        System.out.println("The pizza is in the oven");
    }

    public void box(){
        System.out.println("The pizza is in the box");
    }
}
