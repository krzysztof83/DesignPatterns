package pizzaStores;

import pizza.ItalianPizzaFactory;
import pizza.Pizza;
import pizza.PizzaMenu;

/**
 * Created by Professional on 2018-01-06.
 */
public class ItalianPizzaStore extends PizzaStore {

    public ItalianPizzaStore(){
        this.pizzaFactory = new ItalianPizzaFactory();
    }

    protected Pizza createPizza(PizzaMenu pizzaMenu) {
        return pizzaFactory.createPizza(pizzaMenu);
    }
}
