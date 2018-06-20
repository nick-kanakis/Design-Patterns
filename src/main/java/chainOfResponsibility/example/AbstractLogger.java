package chainOfResponsibility.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int ERROR = 2;
    public static final int FATAL = 3;

    AbstractLogger nextLevel;
    int level;

    public void setNextLevel(AbstractLogger nextLevel) {
        this.nextLevel = nextLevel;
    }

    public void logMessage(int level){
        if(level<=this.level)
            write(level);

        if(nextLevel != null){
            nextLevel.logMessage(level);
        }
    }

    abstract void write(int level);
}
