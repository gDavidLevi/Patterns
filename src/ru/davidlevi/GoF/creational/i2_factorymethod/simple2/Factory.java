package ru.davidlevi.GoF.creational.i2_factorymethod.simple2;

/**
 * Фабрика Factory создана как абстрактный класс с обязательным методом createAutomobile()
 */
abstract class Factory {
    /**
     * Метод создает автомобиль
     *
     * @return Automobile
     */
    public abstract Automobile createAutomobile();
}
