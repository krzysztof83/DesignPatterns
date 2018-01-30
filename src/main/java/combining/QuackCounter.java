/**
 * Created by Professional on 2018-01-29.
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int quackCounter;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCounter++;
    }

    public static int getQuackCounter() {
        return quackCounter;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
