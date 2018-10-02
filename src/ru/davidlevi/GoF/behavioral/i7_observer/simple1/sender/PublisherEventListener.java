package ru.davidlevi.GoF.behavioral.i7_observer.simple1.sender;

/**
 * Интерфейс PublisherEventListener отпределяет события, на которые должны реагировать классы получателей
 */
public interface PublisherEventListener {
    /**
     * Произошло некое событие
     *
     * @param message String
     */
    void event1(String message); // событие
}
