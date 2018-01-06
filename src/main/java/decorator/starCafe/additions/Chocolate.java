package additions;

import drinks.Drink;

/**
 * Created by Professional on 2018-01-05.
 */
public class Chocolate extends Additions {

    public Chocolate(Drink drink) {
        this.drink = drink;
        this.drinkSize = drink.getDrinkSize();
    }

    public String getDescription() {
        return drink.getDescription() + ", Chocolate";
    }

    protected double getStandardCost() {
        return 0.15;
    }

    public double getCost() {
        double cost = drink.getCost() + getCostModifedBySize(getStandardCost(), drink.getDrinkSize());
        return roundCost(cost);
    }
}
