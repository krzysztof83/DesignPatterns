package start;

import additions.Chocolate;
import additions.Milk;
import additions.Soy;
import drinks.Americano;
import drinks.Drink;
import drinks.Espresso;
import drinks.Ristretto;

/**
 * Created by Professional on 2018-01-05.
 */
public class StartCoffeStart {



    public static void main(String[] args) {

        Drink espresso = new Espresso(Drink.DRINK_SIZE_SMALL);
        System.out.println(espresso.getDescription()
                + " $" + Drink.priceFormat.format(espresso.getCost()));

        Drink americano = new Americano(Drink.DRINK_SIZE_MEDIUM);
        americano = new Milk(americano);
        americano = new Milk(americano);
        americano = new Chocolate(americano);
        System.out.println(americano.getDescription()
                + " $" + Drink.priceFormat.format(americano.getCost()));

        Drink ristretto = new Ristretto(Drink.DRINK_SIZE_BIG);
        ristretto = new Soy(ristretto);
        ristretto = new Milk(ristretto);
        ristretto = new Chocolate(ristretto);
        System.out.println(ristretto.getDescription()
                + " $" + Drink.priceFormat.format(ristretto.getCost()));
    }
}
