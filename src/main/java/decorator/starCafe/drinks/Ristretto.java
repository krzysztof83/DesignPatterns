package drinks;

/**
 * Created by Professional on 2018-01-04.
 */
public class Ristretto extends Drink {

    public Ristretto() {
        this.description = "Ristrero";
        this.drinkSize = DRINK_SIZE_MEDIUM;
    }
    public Ristretto(int size) {
        this.description = "Ristrero";
        this.drinkSize = size;
    }
    protected double getStandardCost() {
        return 2.50;
    }

    public double getCost() {
        double cost = getCostModifedBySize(getStandardCost(), getDrinkSize());;
        return roundCost(cost);
    }
}
