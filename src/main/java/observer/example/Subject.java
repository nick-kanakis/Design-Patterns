package observer.example;

/**
 * Created by Nicolas on 2/6/2018.
 */
public interface Subject {
    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers();
}
