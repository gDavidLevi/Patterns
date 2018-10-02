package ru.davidlevi.GoF.creational.i2_factorymethod.simple1;

/**
 * Класс Geep реализует поведение Car
 */
public class Geep implements Car {
    @Override
    public void drive() {
        System.out.println("Скорость движения 60 км/ч");
    }

    @Override
    public void stop() {
        System.out.println("Останавливается за 10 секунд");
    }
}
