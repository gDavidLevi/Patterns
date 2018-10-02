package ru.davidlevi.GoF.creational.i3_abstractfactory.transport.implementation.aircraft;

import ru.davidlevi.GoF.creational.i3_abstractfactory.transport.interfaces.Aircraft;

/**
 * TU134
 */
public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("TU-134 flight!");
    }
}
