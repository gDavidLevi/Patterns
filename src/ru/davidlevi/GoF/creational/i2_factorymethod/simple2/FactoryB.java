package ru.davidlevi.GoF.creational.i2_factorymethod.simple2;

/**
 * Завод B
 */
public class FactoryB extends Factory {
    @Override
    public Automobile createAutomobile() {
        return new Lada();
    }
}
