package weatherStation;

/**
 * Created by Professional on 2018-01-01.
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
