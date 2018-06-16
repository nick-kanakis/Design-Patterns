package state.example;

/**
 * Created by Nicolas on 10/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        Context ctx = new Context();
        System.out.println("Player initialized, currently stopped ");
        System.out.println(">Press stop");
        ctx.stop();
        System.out.println(">Press start");
        ctx.start();
        System.out.println(">Press start");
        ctx.start();
        System.out.println(">Press stop");
        ctx.stop();
        System.out.println(">Press start");
        ctx.start();
        System.out.println(">Press stop");
        ctx.stop();
        System.out.println(">Press stop");
        ctx.stop();
    }
}
