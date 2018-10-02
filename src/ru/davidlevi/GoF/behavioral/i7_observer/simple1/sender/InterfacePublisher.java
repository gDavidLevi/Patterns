package ru.davidlevi.GoF.behavioral.i7_observer.simple1.sender;

import java.util.ArrayList;

/**
 * Интерфейс InterfacePublisher определяет поведение отправителя
 */
public interface InterfacePublisher {
    /**
     * Отправитель возвращает список слушателей
     *
     * @return ArrayList<PublisherEventListener>
     */
    ArrayList<PublisherEventListener> getListeners();

    /**
     * Метод добавляет слушателя
     *
     * @param listener PublisherEventListener
     */
    void addEventListener(PublisherEventListener listener);

    /**
     * Метод удаляет слушателя
     *
     * @param listener PublisherEventListener
     */
    void removeListener(PublisherEventListener listener);

    /**
     * Метод удаляет всех слушателей
     */
    void removeAllListeners();

    /**
     * Метод уведомляет всех слушателей (подписчиков)
     *
     * @param message String
     */
    void notifySubscribers(String message);
}
