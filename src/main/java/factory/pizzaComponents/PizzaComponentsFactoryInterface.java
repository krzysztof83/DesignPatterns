package pizzaComponents;


/**
 * Created by Professional on 2018-01-07.
 */
public interface PizzaComponentsFactoryInterface {

    Dough createDough();
    Sauce createSouce();
    Cheese createCheese();
    Pepperoni createPepperoni();
    Clams createClams();


}
