package ru.davidlevi.GoF.creational.i3_abstractfactory.factory.interfaces;

import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.interfaces.Aircraft;
import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.interfaces.Car;

/**
 * Абстрактная фабрика по созданию транспортных средств.
 * То что фабрика будет производить:
 */
public interface AbstractFactory {
    Car createCar(); // поведение 1: автомобили

    Aircraft createAircraft(); // поведение 2: самолеты
}
