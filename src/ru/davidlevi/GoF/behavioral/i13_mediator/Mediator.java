package ru.davidlevi.GoF.behavioral.i13_mediator;

/**
 * "Посредник" определяет интерфейс для обмена информацией с объектами "Коллеги"
 */
interface Mediator {
    void send(String message, Colleague sender); // поведение "отправка"
}
