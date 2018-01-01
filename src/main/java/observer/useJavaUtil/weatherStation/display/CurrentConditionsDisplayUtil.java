package weatherStation.display;

import weatherStation.WeatherDataUtil;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Professional on 2018-01-01.
 */
public class CurrentConditionsDisplayUtil implements Observer, DisplayElementUtil {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayUtil(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataUtil) {
            WeatherDataUtil weatherDataUtil = (WeatherDataUtil) o;
            this.temperature = weatherDataUtil.getTemperature();
            this.humidity = weatherDataUtil.getHumidity();
            display();
        }
    }
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
