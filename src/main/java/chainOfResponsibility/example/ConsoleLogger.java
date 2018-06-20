package chainOfResponsibility.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level=level;
    }

    @Override
    void write(int level) {
        System.out.println("Console logger level: "+ level);
    }
}
