/**
 * Created by Professional on 2018-01-29.
 */
public class DecoyDuck implements Quackable {
    Observable observable;

    public DecoyDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("QUA");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
