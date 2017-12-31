package strategy.ducks.quackable;

/**
 * Created by Professional on 2017-12-31.
 */
public class DontQwack implements Quackable {
    public String quack() {
        return "<SILENT>";
    }
}
