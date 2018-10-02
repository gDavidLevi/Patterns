package ru.davidlevi.GoF.creational.i2_factorymethod.simple2;

/**
 * Завод А
 */
public class FactoryA extends Factory {
    @Override
    public Automobile createAutomobile() {
        return new Moskvich();
    }
}
