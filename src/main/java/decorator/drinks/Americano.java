package drinks;

/**
 * Created by Professional on 2018-01-04.
 */
public class Americano extends Drink {

    public Americano() {
        this.description = "Americano";
        this.drinkSize = DRINK_SIZE_MEDIUM;
    }

    public Americano(int size) {
        this.description = "Americano";
        this.drinkSize = size;
    }

    protected double getStandardCost() {
        return 1.50;
    }

    public double getCost() {
       double cost = getCostModifedBySize(getStandardCost(), getDrinkSize());
       return roundCost(cost);
    }
}
