package additions;

import drinks.Drink;

/**
 * Created by Professional on 2018-01-04.
 */
public abstract class Additions extends Drink{

    protected Drink drink;

    public Drink getDrink() {
        return drink;
    }

    public Additions setDrink(Drink drink) {
        this.drink = drink;
        return this;
    }

    @Override
    public abstract String getDescription();
}
