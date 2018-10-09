package ru.davidlevi.SOLID.L;

/**
 * Конкретный Электробус
 */
public class ElectricBus extends Machine {
    @Override
    void accelerate() {
        super.accelerate();
        increaseVoltage();
        connectIndividualEngines();
    }

    private void increaseVoltage() {
        // Увеличение напряжения
    }

    private void connectIndividualEngines() {
        // Connection logic
    }
}
