package ru.davidlevi.SOLID.L;

/**
 * Клиентский класс должен иметь возможность использовать любой из этих классов если он может использовать класс Machine
 */
public class Driver {
    // Метод может использовать любую машину
    void go (Machine machine) {
        machine.startEngine();
        machine.accelerate();
    }
}
