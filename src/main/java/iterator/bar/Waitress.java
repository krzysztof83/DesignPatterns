package bar;

import java.util.List;

/**
 * Created by Professional on 2018-01-19.
 */
public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus=menus;
    }

    public void printMenu() {
        java.util.Iterator menuIterator = menus.iterator();
        while(menuIterator.hasNext()) {
            Menu menu = (Menu)menuIterator.next();
            System.out.println();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(java.util.Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
