package builder.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
public interface CarBuilder {

    CarBuilder setColor(final String color);
    CarBuilder setWheels(final int wheels);
    Car getCar();
}
