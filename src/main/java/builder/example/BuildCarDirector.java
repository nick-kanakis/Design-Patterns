package builder.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
public class BuildCarDirector {
    private CarBuilder carBuilder;

    public BuildCarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildCar(){
        return carBuilder.setColor("Red")
                .setWheels(4)
                .getCar();
    }
}
