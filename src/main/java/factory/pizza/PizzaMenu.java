package pizza;

/**
 * Created by Professional on 2018-01-06.
 */
public enum PizzaMenu {

    CHEESE("Chesse"),
    PEPPERONI("Pepperoni"),
    SEAFOOD("SeaFood"),
    VEGGIE("Veggie");

    private String pizzaNameFromMenu;

    PizzaMenu(String pizzaNameFromMenu) {
        this.pizzaNameFromMenu = pizzaNameFromMenu;
    }

    public String getPizzaFromMenu(){
        return pizzaNameFromMenu;
    }


}
