package ru.davidlevi.GoF.creational.i3_abstractfactory;

import ru.davidlevi.GoF.creational.i3_abstractfactory.factory.implementation.RussianFactory;
import ru.davidlevi.GoF.creational.i3_abstractfactory.factory.implementation.USAFactory;
import ru.davidlevi.GoF.creational.i3_abstractfactory.factory.interfaces.AbstractFactory;

/**
 * Паттерн Abstract abstractFactory (Абстрактная фабрика)
 * <p>
 * Назначение:
 * - Предоставляет интерфейс для создания семейств взаимосвязанных или взаимозависимых объектов, не специфицируя их
 * конкретных классов.
 * Плюсы:
 * - изолирует конкретные классы;
 * - упрощает замену семейств продуктов;
 * - гарантирует сочетаемость продуктов.
 * Минусы:
 * - сложно добавить поддержку нового вида продуктов.
 * Примечание:
 * - Система не должна зависеть от того, как создаются, компонуются и представляются входящие в неё объекты.
 * - Входящие в семейство взаимосвязанные объекты должны использоваться вместе и вам необходимо обеспечить выполнение
 * этого ограничения.
 * - Система должна конфигурироваться одним из семейств составляющих её объектов.
 * - Требуется предоставить библиотеку объектов, раскрывая только их интерфейсы, но не реализацию.
 */
public class MainClass {
    public static void main(String[] args) {
        AbstractFactory abstractFactory; // абстрактная фабрика
        if (true)
            abstractFactory = RussianFactory.getInstance(); // эту фабрику реализовали через синглтон
        else
            abstractFactory = new USAFactory();
        // В зависомости какой завод выбран, то и производит абстрактная фабрика
        abstractFactory.createAircraft();
        abstractFactory.createCar();
    }
}
