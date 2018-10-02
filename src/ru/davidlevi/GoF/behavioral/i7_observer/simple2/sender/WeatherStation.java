package ru.davidlevi.GoF.behavioral.i7_observer.simple2.sender;

import java.util.LinkedList;
import java.util.List;

/**
 * Издатель (отправитель)
 */
public class WeatherStation implements InterfaceWeatherStation {
    private List<WeatherEventListener> listeners;
    private float temperature;
    private float humidity;
    private int pressure;

    public WeatherStation() {
        listeners = new LinkedList<>();
    }

    @Override
    public void registerListener(WeatherEventListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(WeatherEventListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyListeners() {
        for (WeatherEventListener weatherEventListener : listeners)
            weatherEventListener.eventUpdate(temperature, humidity, pressure);
    }

    public void setMeasurements(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyListeners();
    }
}
