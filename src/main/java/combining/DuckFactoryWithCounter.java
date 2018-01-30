/**
 * Created by Professional on 2018-01-29.
 */
public class DuckFactoryWithCounter extends AbstractDuckFactory {
    @Override
    public Quackable createWildDuck() {
        return new QuackCounter(new WildDuck());
    }

    @Override
    public Quackable createMalardDuck() {
        return new QuackCounter(new MalardDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createDecoyDuck() {
        return new QuackCounter(new DecoyDuck());
    }
}
