package ru.davidlevi.SOLID.L;

/**
 * Конкретный Автомобиль
 */
public class Car extends Machine {
    @Override
    void startEngine() {
        super.startEngine();
        engageIgnition();
    }

    void engageIgnition() {
        // Зажигание
    }
}
