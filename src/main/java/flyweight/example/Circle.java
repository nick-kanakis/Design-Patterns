package flyweight.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
public class Circle {
    int x,y;
    String color;

    public Circle(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Circle: [Color : " + color + ", x : " + x + ", y :" + y);
    }
}
