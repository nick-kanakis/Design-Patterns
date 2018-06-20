package chainOfResponsibility.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level=level;
    }

    @Override
    void write(int level) {
        System.out.println("Error logger level: "+ level);
    }
}
