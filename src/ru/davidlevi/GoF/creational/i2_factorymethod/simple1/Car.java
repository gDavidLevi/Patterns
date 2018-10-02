package ru.davidlevi.GoF.creational.i2_factorymethod.simple1;

/**
 * Интерфейс описывает поведение для все объектов типа Car
 * <p>
 * Но можно было использовать абстрактный класс, если нужно задать реализацию метода по-умолчанию
 */
public interface Car {
    void drive(); // поведение 1

    void stop(); // поведение 2
}
