/**
 * Created by Professional on 2018-01-29.
 */
public interface QuackObservable {
        public void registerObserver(Observer observer);
        public void notifyObservers();
}
