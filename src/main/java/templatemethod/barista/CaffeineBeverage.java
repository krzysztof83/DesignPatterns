/**
 * Created by Professional on 2018-01-16.
 */
public abstract class CaffeineBeverage {

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }


    void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
    abstract void addCondiments();




}
