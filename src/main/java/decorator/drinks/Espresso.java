package drinks;

/**
 * Created by Professional on 2018-01-04.
 */
public class Espresso extends Drink {

    public Espresso() {
        this.description = "Espresso";
        this.drinkSize = DRINK_SIZE_MEDIUM;
    }

    public Espresso(int size) {
        this.description = "Espresso";
        this.drinkSize = size;
    }

    protected double getStandardCost() {
        return 1.99;
    }

    public double getCost() {
        double cost = getCostModifedBySize(getStandardCost(), getDrinkSize());
        return roundCost(cost);
    }
}
