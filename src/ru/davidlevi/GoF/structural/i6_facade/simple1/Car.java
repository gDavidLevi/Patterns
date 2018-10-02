package ru.davidlevi.GoF.structural.i6_facade.simple1;

import ru.davidlevi.GoF.structural.i6_facade.simple1.parts.Door;
import ru.davidlevi.GoF.structural.i6_facade.simple1.parts.Ignition;
import ru.davidlevi.GoF.structural.i6_facade.simple1.parts.Wheel;

/**
 * Фасад
 */
public class Car {
    private Door door = new Door();
    private Ignition zazhiganie = new Ignition();
    private Wheel wheel = new Wheel();

    void go() {
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
}
