package weatherStation.display;

import weatherStation.WeatherDataUtil;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Professional on 2018-01-01.
 */
public class ForecastDisplayUtil implements Observer, DisplayElementUtil {
    private Observable observable;
    private float currentPressure = 0.00f;
    private float lastPressure;

    public ForecastDisplayUtil(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataUtil) {
            WeatherDataUtil weatherDataUtil = (WeatherDataUtil) o;
            this.lastPressure = currentPressure;
            this.currentPressure = weatherDataUtil.getPressure();
            display();
        }
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
