package ru.davidlevi.GoF.creational.i3_abstractfactory.transport.implementation.car;

import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.interfaces.Car;

/**
 * Niva
 */
public class Niva implements Car {
    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {
        System.out.println("Niva stopped");
    }
}
