package pizza;


import pizzaComponents.ItalianComponentsFactory;
import pizzaComponents.PizzaComponentsFactoryInterface;

/**
 * Created by Professional on 2018-01-06.
 */
public class ItalianPizzaFactory implements PizzaFactoryInterface {

    PizzaComponentsFactoryInterface pizzaComponentsFactoryInterface = new ItalianComponentsFactory();

    public Pizza createPizza(PizzaMenu pizzaMenu) {
        Pizza pizza = null;

        if (pizzaMenu.equals(PizzaMenu.CHEESE)) {
            pizza = new CheesePizza(pizzaComponentsFactoryInterface);
        } else if (pizzaMenu.equals(PizzaMenu.PEPPERONI)) {
            pizza = new PepperoniPizza(pizzaComponentsFactoryInterface);
        } else if (pizzaMenu.equals(PizzaMenu.SEAFOOD)) {
            pizza = new SeaFoodPizza(pizzaComponentsFactoryInterface);
        } else if (pizzaMenu.equals(PizzaMenu.VEGGIE)) {
            pizza = new VeggiePizza(pizzaComponentsFactoryInterface);
        }

        return pizza;
    }
}
