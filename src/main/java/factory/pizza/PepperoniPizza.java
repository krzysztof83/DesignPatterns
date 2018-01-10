package pizza;

import pizzaComponents.PizzaComponentsFactoryInterface;
import pizzaComponents.Toppings;

/**
 * Created by Professional on 2018-01-06.
 */
class PepperoniPizza extends Pizza {

    PizzaComponentsFactoryInterface pizzaComponentsFactoryInterface;

    PepperoniPizza(PizzaComponentsFactoryInterface pizzaComponentsFactoryInterface) {
        this.name = "Pepperoni";
        this.pizzaComponentsFactoryInterface = pizzaComponentsFactoryInterface;
    }

    public void prepare() {
        System.out.println("prepare: " + name);
        this.dough = pizzaComponentsFactoryInterface.createDough();
        this.sauce = pizzaComponentsFactoryInterface.createSouce();
        this.cheese = pizzaComponentsFactoryInterface.createCheese();
        this.toppings.add((Toppings)pizzaComponentsFactoryInterface.createPepperoni());
    }
}
