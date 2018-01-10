package pizza;

import pizzaComponents.PizzaComponentsFactoryInterface;

/**
 * Created by Professional on 2018-01-06.
 */
class CheesePizza extends Pizza {

    PizzaComponentsFactoryInterface pizzaComponentsFactoryInterface;

    CheesePizza(PizzaComponentsFactoryInterface pizzaComponentsFactoryInterface) {
        this.name = "Cheese";
        this.pizzaComponentsFactoryInterface = pizzaComponentsFactoryInterface;
    }

    public void prepare() {
        System.out.println("prepare: " + name);
        this.dough = pizzaComponentsFactoryInterface.createDough();
        this.sauce = pizzaComponentsFactoryInterface.createSouce();
        this.cheese = pizzaComponentsFactoryInterface.createCheese();
    }
}
