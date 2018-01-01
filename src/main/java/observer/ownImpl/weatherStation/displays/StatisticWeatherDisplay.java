package weatherStation.displays;

import weatherStation.Observer;
import weatherStation.WeatherData;

/**
 * Created by Professional on 2018-01-01.
 */
public class StatisticWeatherDisplay implements Observer, DisplayElement {

    private float minTemp;
    private float maxTemp;
    private float sumTemp;
    private float avgTemp;
    private int countTemp;
    private WeatherData weatherData;

    public StatisticWeatherDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
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

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (String.format("%.2f", avgTemp))
                + "/" + maxTemp + "/" + minTemp);
    }
}
