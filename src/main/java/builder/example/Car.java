package builder.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
class Car {
    private int wheels;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(final int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car [wheels = " + wheels + ", color = " + color + "]";
    }
}
