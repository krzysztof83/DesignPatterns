import strategy.ducks.*;

import java.util.Stack;

/**
 * Created by Professional on 2017-12-31.
 */
public class MiniSimulatorDuck {

    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        Duck rubberDuck = new RubberDuck();
        Duck shovellerDuck = new ShovellerDuck();

        Stack<Duck> ducks = new Stack<Duck>();
        ducks.add(wildDuck);
        ducks.add(rubberDuck);
        ducks.add(shovellerDuck);

        for (Duck duck : ducks) {
            System.out.println(duck.getDuckName());
            System.out.println(duck.showPicture());
            System.out.println(duck.doQuack());
            System.out.println(duck.doFly());
            System.out.println("-------------");
        }
    }
}
