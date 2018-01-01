package ducks;

import ducks.flyable.IDontFly;
import ducks.quackable.Qwack;

/**
 * Created by Professional on 2017-12-31.
 */
public class DuckModel extends Duck {

    public DuckModel() {
        super();
        this.flyable = new IDontFly();
        this.quackable = new Qwack();
    }

    public String showPicture() {
        return "I'm duck model";
    }

    public String getDuckName() {
        return getClass().getName();
    }

}
