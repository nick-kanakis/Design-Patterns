package builder.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        CarBuilder cb = new CarBuilderImpl();
        BuildCarDirector director = new BuildCarDirector(cb);
        System.out.println(director.buildCar());
    }
}
