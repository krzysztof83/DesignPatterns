/**
 * Created by Professional on 2018-01-30.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck.getClass().getName() + " just quacked.");
    }

    @Override
    public String toString() {
        return "Quackologist";
    }
}
