package weatherStation;

import java.util.Observable;

/**
 * Created by Professional on 2018-01-01.
 */
public class WeatherDataUtil extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

