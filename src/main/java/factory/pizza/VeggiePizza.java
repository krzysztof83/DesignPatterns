package pizza;

import pizzaComponents.Garlic;
import pizzaComponents.Onion;
import pizzaComponents.PizzaComponentsFactoryInterface;
import pizzaComponents.RedPepper;

/**
 * Created by Professional on 2018-01-06.
 */
class VeggiePizza extends Pizza {

    PizzaComponentsFactoryInterface pizzaComponentsFactoryInterface;

    VeggiePizza(PizzaComponentsFactoryInterface pizzaComponentsFactoryInterface) {
        this.name = "Veggie";
        this.pizzaComponentsFactoryInterface = pizzaComponentsFactoryInterface;
    }

    public void prepare() {
        System.out.println("prepare: " + name);
        this.dough = pizzaComponentsFactoryInterface.createDough();
        this.sauce = pizzaComponentsFactoryInterface.createSouce();
        this.cheese = pizzaComponentsFactoryInterface.createCheese();
        this.toppings.add(new Onion());
        this.toppings.add(new Garlic());
        this.toppings.add(new RedPepper());
    }
}
