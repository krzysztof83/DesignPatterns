package pizza;

import pizzaComponents.Cheese;
import pizzaComponents.Dough;
import pizzaComponents.Sauce;
import pizzaComponents.Toppings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Professional on 2018-01-06.
 */
abstract public class Pizza implements PizzaInterface {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;

    protected List<Toppings> toppings = new ArrayList<Toppings>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {

        StringBuffer display = new StringBuffer();

        display.append("---- " + name + " ----\n");

        display.append(dough.toSting() + "\n");

        display.append(sauce.toSting() + "\n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append(toppings.get(i).toSting() + "\n");
        }
        return display.toString();

    }
}
