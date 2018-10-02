package ru.davidlevi.GoF.creational.i3_abstractfactory.factory.implementation;

import ru.davidlevi.GoF.creational.i3_abstractfactory.factory.interfaces.AbstractFactory;
import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.implementation.aircraft.Boeing747;
import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.implementation.car.Porsche;
import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.interfaces.Aircraft;
import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.interfaces.Car;

/**
 * Американский завод реализует поведение AbstractFactory
 */
public class USAFactory implements AbstractFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
