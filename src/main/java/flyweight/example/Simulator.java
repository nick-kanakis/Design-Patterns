package flyweight.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
public class Simulator {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            System.out.println("Circle Number: "+ i+1);
            Circle circle = CircleFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
            System.out.println("Map Size : "+ CircleFactory.getSizeOfMap());
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
