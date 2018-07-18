package proxy.example;

/**
 * Created by Nicolas on 11/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        //You could use a factory hear.
        Image img = new ProxyImage("My_Image.png");
        System.out.println(">Display for the first time");
        img.display();
        System.out.println(">Display for the second time");
        img.display();
    }
}
