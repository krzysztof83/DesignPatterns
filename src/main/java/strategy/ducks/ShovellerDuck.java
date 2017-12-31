package strategy.ducks;


import strategy.ducks.flyable.FlyBecoseIHaveWings;
import strategy.ducks.quackable.Qwack;

/**
 * Created by Professional on 2017-12-31.
 */
public class ShovellerDuck extends Duck {

    public ShovellerDuck() {
        super();
        this.quackable = new Qwack();
        this.flyable = new FlyBecoseIHaveWings();
    }

    @Override
    public String showPicture() {
        return "Show photo shoveller duck";
    }
    @Override
    public String getDuckName() {
        return getClass().getName();
    }
}
