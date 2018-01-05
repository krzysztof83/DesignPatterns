package additions;

import drinks.Drink;

/**
 * Created by Professional on 2018-01-04.
 */
public class Milk extends Additions{

    public Milk(Drink drink) {
        this.drink = drink;
        this.drinkSize = drink.getDrinkSize();
    }

    public String getDescription() {
        return drink.getDescription() + ", Milk" ;
    }

    protected double getStandardCost() {
        return 0.10;
    }

    public double getCost() {
        double cost = drink.getCost() + getCostModifedBySize(getStandardCost(), drink.getDrinkSize());
        return roundCost(cost);
    }
}
