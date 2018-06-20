package builder.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
public class CarBuilderImpl implements CarBuilder {
    private Car car;

    public CarBuilderImpl() {
        this.car = new Car();
    }

    @Override
    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder setWheels(int wheels) {
        car.setWheels(wheels);
        return this;
    }

    @Override
    public Car getCar() {
        return car;
    }
}
