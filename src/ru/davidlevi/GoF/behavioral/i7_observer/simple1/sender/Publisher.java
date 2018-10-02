package ru.davidlevi.GoF.behavioral.i7_observer.simple1.sender;

import java.util.ArrayList;

/**
 * Отправитель имплементирует поведение из интерфейса InterfacePublisher
 */
public class Publisher implements InterfacePublisher {
    // Список подписчиков на события
    private ArrayList<PublisherEventListener> listeners = new ArrayList<>();

    @Override
    public ArrayList<PublisherEventListener> getListeners() {
        return listeners;
    }

    @Override
    public void addEventListener(PublisherEventListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(PublisherEventListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllListeners() {
        listeners.clear();
    }

    @Override
    public void notifySubscribers(String message) {
        for (PublisherEventListener actionListener : listeners)
            // Обращаемся к имплементированным методам event1() подписчиков
            actionListener.event1(message);
    }

    public void createNewMessage(String message) {
        System.out.println("Отправитель отправляет сообщение: " + message);
        notifySubscribers(message);
    }
}
