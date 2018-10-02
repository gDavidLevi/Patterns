package ru.davidlevi.GoF.creational.i3_abstractfactory.transport.implementation.car;

import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.interfaces.Car;

/**
 * Porsche
 */
public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 1 sec");
    }
}
