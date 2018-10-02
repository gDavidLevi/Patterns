package ru.davidlevi.GoF.creational.i2_factorymethod.simple1;

/**
 * Класс Porsche реализует поведение Car
 */
public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Скорость движения 160 км/ч");
    }

    @Override
    public void stop() {
        System.out.println("Останавливается за 3 секунды");
    }
}
