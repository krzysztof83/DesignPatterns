package weatherStation.display;

import weatherStation.WeatherDataUtil;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Professional on 2018-01-01.
 */
public class StatisticWeatherDisplayUtil implements Observer, DisplayElementUtil{
    private Observable observable;
    private float minTemp;
    private float maxTemp;
    private float sumTemp;
    private float avgTemp;
    private int countTemp;

    public StatisticWeatherDisplayUtil(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataUtil) {
            WeatherDataUtil weatherDataUtil = (WeatherDataUtil) o;
            float temperature = weatherDataUtil.getTemperature();
            if (temperature < minTemp) {
                this.minTemp = temperature;
            } else if (temperature > maxTemp) {
                this.maxTemp = temperature;
            }
            this.sumTemp += temperature;
            countTemp++;
            this.avgTemp = sumTemp / countTemp;
            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (String.format("%.2f", avgTemp))
                + "/" + maxTemp + "/" + minTemp);
    }
}
