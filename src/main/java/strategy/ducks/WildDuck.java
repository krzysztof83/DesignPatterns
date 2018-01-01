package ducks;

import ducks.flyable.FlyBecoseIHaveWings;
import ducks.quackable.Qwack;

/**
 * Created by Professional on 2017-12-31.
 */
public class WildDuck extends Duck {

    public WildDuck() {
        super();
        this.quackable = new Qwack();
        this.flyable = new FlyBecoseIHaveWings();
    }

    @Override
    public String showPicture() {
        return "Show photo wild duck";
    }

    @Override
    public String getDuckName() {
        return getClass().getName();
    }
}
