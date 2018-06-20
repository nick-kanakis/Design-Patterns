package chainOfResponsibility.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level=level;
    }

    @Override
    void write(int level) {
        System.out.println("File logger level: "+ level);
    }
}
