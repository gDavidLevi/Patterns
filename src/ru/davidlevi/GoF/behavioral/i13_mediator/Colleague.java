package ru.davidlevi.GoF.behavioral.i13_mediator;

/**
 * Каждый класс "Коллеги" знает о своем объекте "Посредник".
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public abstract void notify(String message);
}
