import pizza.Pizza;
import pizza.PizzaMenu;
import pizzaStores.AmericanPizzaStore;
import pizzaStores.ItalianPizzaStore;
import pizzaStores.PizzaStore;

/**
 * Created by Professional on 2018-01-06.
 */
public class PizzaStoreTestStart {

    public static void main(String[] args) {

        PizzaStore italianPizzaStore = new ItalianPizzaStore();
        Pizza italianPizza = italianPizzaStore.orderPizza(PizzaMenu.VEGGIE);
        System.out.println("Italian vegie:" + italianPizza.toString());

        System.out.println();

        PizzaStore americanPizzaStore4 = new AmericanPizzaStore();
        Pizza americanPizza4 = americanPizzaStore4.orderPizza(PizzaMenu.CHEESE);
        System.out.println("American cheese: " + americanPizza4.toString());

        System.out.println();
    }
}
