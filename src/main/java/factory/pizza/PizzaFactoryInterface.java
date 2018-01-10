package pizza;

import pizza.Pizza;
import pizza.PizzaMenu;

/**
 * Created by Professional on 2018-01-06.
 */
public interface PizzaFactoryInterface {

    Pizza createPizza(PizzaMenu pizzaMenu);
}
