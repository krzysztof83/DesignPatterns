/**
 * Created by Professional on 2018-01-16.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

}
