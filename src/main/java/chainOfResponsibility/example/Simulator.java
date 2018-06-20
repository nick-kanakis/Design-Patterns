package chainOfResponsibility.example;

/**
 * Created by Nicolas on 16/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        AbstractLogger logger = getLoggersChain();

        logger.logMessage(AbstractLogger.INFO);
        logger.logMessage(AbstractLogger.ERROR);
        logger.logMessage(AbstractLogger.FATAL);
    }

    private static AbstractLogger getLoggersChain(){
        AbstractLogger consoleLog = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger errorLog = new ConsoleLogger(AbstractLogger.ERROR);
        AbstractLogger fileLog = new ConsoleLogger(AbstractLogger.FATAL);

        consoleLog.setNextLevel(errorLog);
        errorLog.setNextLevel(fileLog);

        return consoleLog;
    }
}
