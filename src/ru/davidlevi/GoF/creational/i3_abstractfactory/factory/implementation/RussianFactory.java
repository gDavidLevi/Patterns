package ru.davidlevi.GoF.creational.i3_abstractfactory.factory.implementation;

import ru.davidlevi.GoF.creational.i3_abstractfactory.factory.interfaces.AbstractFactory;
import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.implementation.aircraft.TU134;
import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.implementation.car.Niva;
import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.interfaces.Aircraft;
import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.interfaces.Car;

/**
 * Российский завод реализует поведение AbstractFactory
 */
public class RussianFactory implements AbstractFactory {
    /**
     * Данная фабрика у нас будет в единственном экземпляре, будет рационально её организовать через синглтон,
     * а затем уже обратиться к методу createCar().
     */
    private static RussianFactory instance;

    public static RussianFactory getInstance() {
        if (instance == null)
            instance = new RussianFactory();
        return instance;
    }

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
