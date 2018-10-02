package ru.davidlevi.GoF.behavioral.i8_sate.context;

import ru.davidlevi.GoF.behavioral.i8_sate.state.InterfaceState;

/**
 * Класс Calculate.
 * Его объекты должны менять свое поведение в зависимости от состояния
 */
public class Context implements InterfaceState {
    @Override
    public void whatIsTheState() {
        this.state.whatIsTheState();
    }

    private InterfaceState state; // хранит состояние

    /**
     * Метод возвращает состояние
     *
     * @return InterfaceState состояние
     */
    public InterfaceState getState() {
        return state;
    }

    /**
     * Метод устанавливает состояние
     *
     * @param state InterfaceState состояние
     */
    public void setState(InterfaceState state) {
        this.state = state;
    }
}
