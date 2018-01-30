/**
 * Created by Professional on 2018-01-29.
 */
public class DuckCombiningStart {
    public static void main(String[] args) {
        DuckCombiningStart duckCombiningStart = new DuckCombiningStart();
        AbstractDuckFactory duckFactory = new DuckFactoryWithCounter();

        duckCombiningStart.start(duckFactory);
    }

    private void start(AbstractDuckFactory duckFactory) {

        Quackable malardDuck = duckFactory.createMalardDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable decoyDuck = duckFactory.createDecoyDuck();
        Quackable gosse = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flock flockDuck = new Flock();

        flockDuck.add(malardDuck);
        flockDuck.add(rubberDuck);
        flockDuck.add(decoyDuck);
        flockDuck.add(gosse);

        Flock flockWildDuck = new Flock();

        Quackable wildDuck1 = duckFactory.createWildDuck();
        Quackable wildDuck2 = duckFactory.createWildDuck();
        Quackable wildDuck3 = duckFactory.createWildDuck();
        Quackable wildDuck4 = duckFactory.createWildDuck();

        flockWildDuck.add(wildDuck1);
        flockWildDuck.add(wildDuck2);
        flockWildDuck.add(wildDuck3);
        flockWildDuck.add(wildDuck4);

        flockDuck.add(flockWildDuck);

        System.out.println("\nDuck Simulator: With Observer");

        Quackologist quackologist = new Quackologist();
        flockDuck.registerObserver(quackologist);

        start(flockDuck);

        System.out.println("\nThe ducks quacked " +
                QuackCounter.getQuackCounter() +
                " times");


    }

    private void start(Quackable quackable) {
        quackable.quack();
    }
}
