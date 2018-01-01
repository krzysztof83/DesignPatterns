package start;


import weatherStation.WeatherDataUtil;
import weatherStation.display.CurrentConditionsDisplayUtil;
import weatherStation.display.ForecastDisplayUtil;
import weatherStation.display.HeatIndexDisplayUtil;
import weatherStation.display.StatisticWeatherDisplayUtil;

/**
 * Created by Professional on 2018-01-01.
 */
public class WeatherStationStartUtil {

    public static void main(String[] args) {
        WeatherDataUtil weatherDataUtil = new WeatherDataUtil();
        System.out.println("Observer with java.util");
        CurrentConditionsDisplayUtil currentConditionsDisplayUtil = new CurrentConditionsDisplayUtil(weatherDataUtil);
        ForecastDisplayUtil forecastDisplayUtil = new ForecastDisplayUtil(weatherDataUtil);
        StatisticWeatherDisplayUtil statisticWeatherDisplay = new StatisticWeatherDisplayUtil(weatherDataUtil);
        HeatIndexDisplayUtil heatIndexDisplayUtil = new HeatIndexDisplayUtil(weatherDataUtil);
        System.out.println("==========================================================");
        weatherDataUtil.setMeasurements(32.7f, 34.2f,1017.1f);
        System.out.println("==========================================================");
        weatherDataUtil.setMeasurements(25.6f, 45.6f,997.8f);
        System.out.println("==========================================================");
        weatherDataUtil.setMeasurements(13.1f, 73.5f,1001.3f);
        System.out.println("==========================================================");
    }
}

