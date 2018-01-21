package bar;

import bar.caffeMenu.CafeMenu;
import dinnerMenu.DinerMenu;
import pancakeHouse.PancakeHouseMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Professional on 2018-01-20.
 */
public class MenuStart {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        List<Menu> menus = new ArrayList<Menu>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);
        Waitress waitress = new Waitress(menus);

        waitress.printMenu();

    }
}
