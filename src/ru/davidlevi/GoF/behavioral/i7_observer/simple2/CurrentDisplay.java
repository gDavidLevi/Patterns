package ru.davidlevi.GoF.behavioral.i7_observer.simple2;

import ru.davidlevi.GoF.behavioral.i7_observer.simple2.sender.WeatherEventListener;
import ru.davidlevi.GoF.behavioral.i7_observer.simple2.sender.WeatherStation;

/**
 * Подписчик на события
 */
public class CurrentDisplay implements WeatherEventListener {
    /**
     * Событие "Обновление"
     * Когда отправитель (погодная станция) начнет вещать сообщения, тогда инициируются поля данного класса и
     * выполнится приватный метод display().
     *
     * @param temperature float
     * @param humidity    float
     * @param pressure    float
     */
    @Override
    public void eventUpdate(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private float temperature;
    private float humidity;
    private int pressure;
    private WeatherStation station;

    /**
     * Конструктор
     *
     * @param station WeatherStation
     */
    CurrentDisplay(WeatherStation station) {
        this.station = station;
        // Регистрируем на станции слушателя (данный класс)
        station.registerListener(this);
    }

    private void display() {
        System.out.printf("Сейчас значения: %.1f градусов цельсия и %.1f %% влажности; давление %d мм рт. ст.%n", temperature, humidity, pressure);
    }
}
