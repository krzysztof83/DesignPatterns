package drinks;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Professional on 2018-01-04.
 */
public abstract class Drink {

    public static final int DRINK_SIZE_SMALL = 1;
    public static final int DRINK_SIZE_MEDIUM = 2;
    public static final int DRINK_SIZE_BIG = 3;

    public static final double PRICE_MODIFER_SMALL = 0.8;
    public static final double PRICE_MODIFER_MEDIUM = 1;
    public static final double PRICE_MODIFER_BIG = 1.2;

    private static final int PRICE_SCALE = 2;

    public static final DecimalFormat priceFormat = new DecimalFormat("#.00");

    public static final Map<Integer, Double> priceModiferMap = initPriceModiferMap();

    private static Map<Integer,Double> initPriceModiferMap() {
        Map<Integer,Double> priceMap = new HashMap<Integer, Double>();
        priceMap.put(DRINK_SIZE_SMALL,PRICE_MODIFER_SMALL);
        priceMap.put(DRINK_SIZE_MEDIUM,PRICE_MODIFER_MEDIUM);
        priceMap.put(DRINK_SIZE_BIG,PRICE_MODIFER_BIG);
        return priceMap;
    }

    protected double getCostModifedBySize(double standardCost, int size) {

        double priceModifer = priceModiferMap.get(size);
        double priceModifedBySize;

        switch (size) {
            case Drink.DRINK_SIZE_SMALL:
                priceModifedBySize = standardCost * priceModifer;
                break;
            case DRINK_SIZE_MEDIUM:
                priceModifedBySize = standardCost * priceModifer;
                break;
            case DRINK_SIZE_BIG:
                priceModifedBySize = standardCost * priceModifer;
                break;
            default:
                priceModifedBySize = standardCost;
        }
        return priceModifedBySize;
    }

    protected String description = "unknown Drink";
    protected int drinkSize = 2;

    public int getDrinkSize() {
        return drinkSize;
    }

    public Drink setDrinkSize(int drinkSize) {
        this.drinkSize = drinkSize;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Drink setDescription(String description) {
        this.description = description;
        return this;
    }

    protected double roundCost(double cost) {
        double roundedCost = new BigDecimal(cost).setScale(PRICE_SCALE,RoundingMode.UP).doubleValue();
        return roundedCost;
    }

    protected abstract double getStandardCost();
    public abstract double getCost();
}
