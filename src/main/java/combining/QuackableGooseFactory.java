/**
 * Created by Professional on 2018-01-29.
 */
public class QuackableGooseFactory extends AbstractQuackableGooseFactory {

    @Override
    Quackable createQuackableGoose() {
        return new GooseAdapter(new Goose());
    }
}
