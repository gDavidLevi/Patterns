package ru.davidlevi.GoF.behavioral.i7_observer.simple2.sender;

/**
 * Интерфейс InterfaceWeatherStation определяет поведение класса WeatherStation
 */
public interface InterfaceWeatherStation {
    // Подписка
    void registerListener(WeatherEventListener o);

    // Отписка
    void removeListener(WeatherEventListener o);

    // Рассылка подписчикам
    void notifyListeners();
}
