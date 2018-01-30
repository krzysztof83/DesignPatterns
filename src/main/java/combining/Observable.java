import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Professional on 2018-01-30.
 */
public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer obserer = (Observer) iterator.next();
            obserer.update(duck);
        }
    }

    public Iterator getObservers() {
        return observers.iterator();
    }
}
