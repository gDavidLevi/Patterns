package ru.davidlevi.GoF.behavioral.i7_observer.simple1;

import ru.davidlevi.GoF.behavioral.i7_observer.simple1.sender.Publisher;

/**
 * Паттерн WeatherEventListener (наблюдатель), Listener (слушатель)
 * <p>
 * Реализует у класса механизм, который позволяет объекту этого класса получать оповещения об изменении состояния других
 * объектов, и тем самым наблюдать за ними.
 * Назначение:
 * - определяет зависимость "один-ко-многим" между объектами так, что при изменении состояния одного объекта все
 * зависящие от него объекты уведомляются и обновляются автоматически;
 * - инкапсулирует главный (независимый) компонент в абстракцию Subject и изменяемые (зависимые) компоненты в
 * иерархию WeatherEventListener;
 * - определяет часть "View" в модели Model-View-Controller (MVC).
 * <p>
 * Применение:
 * - существует, как минимум, один объект, рассылающий сообщения;
 * - имеется не менее одного получателя сообщений, причём их количество и состав могут изменяться во время работы
 * приложения;
 * - нет надобности очень сильно связывать взаимодействующие объекты, что полезно для повторного использования.
 */
public class MainClass {
    public static void main(String[] args) {
        // Подписчики (слушатели) на события
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();

        // Отправитель сообщений
        Publisher publisher = new Publisher();

        // подписка на отправителя
        publisher.addEventListener(subscriber1);
        publisher.addEventListener(subscriber2);

        // Отправитель отправляет сообщени подписчикам
        publisher.createNewMessage("Привет подписчикам!");
    }
}
