package pizzaComponents;


/**
 * Created by Professional on 2018-01-07.
 */
public class ItalianComponentsFactory implements PizzaComponentsFactoryInterface {
    public Dough createDough() {
        return new DoughThinCrust();
    }

    public Sauce createSouce() {
        return new SauceMarinara();
    }

    public Cheese createCheese() {
        return new CheeseReggiano();
    }

    public Pepperoni createPepperoni() {
        return new PepperoniSliced();
    }

    public Clams createClams() {
        return new ClamsFresh();
    }
}
