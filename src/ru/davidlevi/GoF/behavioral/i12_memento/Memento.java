package ru.davidlevi.GoF.behavioral.i12_memento;

/**
 * Хранитель
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
