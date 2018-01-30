/**
 * Created by Professional on 2018-01-29.
 */
public class MalardDuck implements Quackable {
    Observable observable;

    public MalardDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("QuaQua");
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
