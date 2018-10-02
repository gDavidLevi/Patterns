package ru.davidlevi.GoF.behavioral.i7_observer.simple2.sender;

/**
 * Интерфейс WeatherEventListener отпределяет события, на которые должны реагировать классы получателей
 */
public interface WeatherEventListener {
    void eventUpdate(float temperature, float humidity, int pressure);
}
