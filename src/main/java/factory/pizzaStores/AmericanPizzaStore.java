package pizzaStores;

import pizza.AmericanPizzaFactory;
import pizza.Pizza;
import pizza.PizzaMenu;

/**
 * Created by Professional on 2018-01-06.
 */
public class AmericanPizzaStore extends PizzaStore {

    public AmericanPizzaStore() {
        this.pizzaFactory = new AmericanPizzaFactory();
    }

    protected Pizza createPizza(PizzaMenu pizzaMenu) {
        return pizzaFactory.createPizza(pizzaMenu);
    }
}
