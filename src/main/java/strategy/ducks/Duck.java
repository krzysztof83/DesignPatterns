package strategy.ducks;


import strategy.ducks.flyable.Flyable;
import strategy.ducks.quackable.Quackable;

/**
 * Created by Professional on 2017-12-31.
 */
public abstract class Duck {
    protected Quackable quackable;

    protected Flyable flyable;

    public abstract String showPicture();
    public abstract String getDuckName();

    public String doQuack() {
        return quackable.quack();
    }

    public String doFly() {
        return flyable.fly();
    }

    public String swim() {
        return "Swim swim";
    }

    public Duck setQuackable(Quackable quackable) {
        this.quackable = quackable;
        return this;
    }

    public Duck setFlyable(Flyable flyable) {
        this.flyable = flyable;
        return this;
    }
}
