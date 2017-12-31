package strategy.ducks;

import strategy.ducks.flyable.IDontFly;
import strategy.ducks.quackable.Squeak;

/**
 * Created by Professional on 2017-12-31.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        this.quackable = new Squeak();
        this.flyable = new IDontFly();
    }

    @Override
    public String showPicture() {
        return "Show photo rubber duck";
    }

    @Override
    public String getDuckName() {
        return getClass().getName();
    }
}
