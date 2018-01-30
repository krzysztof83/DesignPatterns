import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Professional on 2018-01-29.
 */
public class Flock implements Quackable {
    List<Quackable> quackables = new ArrayList<Quackable>();

    public void add(Quackable bird) {
        quackables.add(bird);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()) {
            Quackable bird = (Quackable) iterator.next();
            bird.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()) {
            Quackable bird = (Quackable) iterator.next();
            bird.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
