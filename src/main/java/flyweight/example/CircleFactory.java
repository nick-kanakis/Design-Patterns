package flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nicolas on 16/6/2018.
 */
public class CircleFactory {

    private static Map<String,Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color){
        circleMap.putIfAbsent(color,  new Circle(color));
        return circleMap.get(color);
    }

    public static int getSizeOfMap(){
        return circleMap.size();
    }
}
