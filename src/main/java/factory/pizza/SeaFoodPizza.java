package pizza;

import pizzaComponents.PizzaComponentsFactoryInterface;
import pizzaComponents.Toppings;

/**
 * Created by Professional on 2018-01-06.
 */
class SeaFoodPizza extends Pizza {

    PizzaComponentsFactoryInterface pizzaComponentsFactoryInterface;

    SeaFoodPizza(PizzaComponentsFactoryInterface pizzaComponentsFactoryInterface) {
        this.name = "SeaFood";
        this.pizzaComponentsFactoryInterface = pizzaComponentsFactoryInterface;
    }

    public void prepare() {
        System.out.println("prepare: " + name);
        this.dough = pizzaComponentsFactoryInterface.createDough();
        this.sauce = pizzaComponentsFactoryInterface.createSouce();
        this.cheese = pizzaComponentsFactoryInterface.createCheese();
        this.toppings.add((Toppings)pizzaComponentsFactoryInterface.createClams());
    }
}
