/**
 * Created by Professional on 2018-01-29.
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createWildDuck() {
        return new WildDuck();
    }

    @Override
    public Quackable createMalardDuck() {
        return new MalardDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createDecoyDuck() {
        return new DecoyDuck();
    }
}
