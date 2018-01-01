package start;


import weatherStation.WeatherData;
import weatherStation.displays.CurrentConditionsDisplay;
import weatherStation.displays.ForecastDisplay;
import weatherStation.displays.HeatIndexDisplay;
import weatherStation.displays.StatisticWeatherDisplay;

/**
 * Created by Professional on 2018-01-01.
 */
public class WeatherStationStart {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticWeatherDisplay statisticWeatherDisplay = new StatisticWeatherDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        System.out.println("==========================================================");
        weatherData.setMeasurements(32.7f, 34.2f,1017.1f);
        System.out.println("==========================================================");
        weatherData.setMeasurements(25.6f, 45.6f,997.8f);
        System.out.println("==========================================================");
        weatherData.setMeasurements(13.1f, 73.5f,1001.3f);
        System.out.println("==========================================================");
    }
}
