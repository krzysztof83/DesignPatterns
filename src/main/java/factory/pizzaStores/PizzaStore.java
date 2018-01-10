package pizzaStores;

import pizza.Pizza;
import pizza.PizzaFactoryInterface;
import pizza.PizzaMenu;

/**
 * Created by Professional on 2018-01-06.
 */
public abstract class PizzaStore {

    public PizzaFactoryInterface pizzaFactory;

    public Pizza orderPizza(PizzaMenu pizzaMenu) {
        Pizza pizza = pizzaFactory.createPizza(pizzaMenu);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaMenu pizzaMenu);

}
