package ru.davidlevi.GoF.behavioral.i7_observer.simple1;

import ru.davidlevi.GoF.behavioral.i7_observer.simple1.sender.PublisherEventListener;

/**
 * Подписчик с имплементированным методом из слушателя
 */
public class Subscriber1 implements PublisherEventListener {
    @Override
    public void event1(String message) {
        System.out.printf("Подписчик %s получил сообщение: %s%n", this.getClass().getName(), message);
    }
}
