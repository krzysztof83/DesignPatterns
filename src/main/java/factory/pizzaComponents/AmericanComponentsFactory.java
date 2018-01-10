package pizzaComponents;

/**
 * Created by Professional on 2018-01-07.
 */
public class AmericanComponentsFactory implements PizzaComponentsFactoryInterface {
    public Dough createDough() {
        return new DoughFatCrust();
    }

    public Sauce createSouce() {
        return new SauceTomato();
    }

    public Cheese createCheese() {
        return new ChesseMozarella();
    }

    public Pepperoni createPepperoni() {
        return new PepperoniSliced();
    }

    public Clams createClams() {
        return new ClamsFrozen();
    }
}
