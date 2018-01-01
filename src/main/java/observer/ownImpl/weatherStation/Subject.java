package weatherStation;

/**
 * Created by Professional on 2018-01-01.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObserver();
}
