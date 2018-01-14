/**
 * Created by Professional on 2018-01-13.
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    int count = 0;
    public DuckAdapter(MallardDuck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (count%5 == 0){
            duck.fly();
        }
        count++;
    }
}
